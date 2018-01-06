package com.compile.miniJava;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.Map;

import static com.compile.miniJava.VarType.typeInt;

public class CheckPhase extends miniJavaBaseListener {
    Block globalBlock;
    Range currentRange;
    ParseTreeProperty<Range> range = new ParseTreeProperty<>();
    Map<ClassSymbol, Range> classRange;
    ParseTreeProperty<VarType> exprType = new ParseTreeProperty<>();
    ParseTreeProperty<ClassSymbol> exprClassSymbol = new ParseTreeProperty<>();

    CheckPhase(Block globalBlock, ParseTreeProperty<Range> range, Map<ClassSymbol, Range> classRange) {
        this.globalBlock = globalBlock;
        this.range = range;
        this.classRange = classRange;
    }

    @Override
    public void enterGoal(miniJavaParser.GoalContext ctx) {
        currentRange = globalBlock;
    }

    @Override
    public void exitGoal(miniJavaParser.GoalContext ctx) {
        currentRange = currentRange.getParentRange();
    }

    @Override
    public void enterMainclass(miniJavaParser.MainclassContext ctx) {
        currentRange = range.get(ctx);
    }

    @Override
    public void exitMainclass(miniJavaParser.MainclassContext ctx) {
        currentRange = currentRange.getParentRange();
    }

    @Override
    public void enterClassdeclaration(miniJavaParser.ClassdeclarationContext ctx) {
        currentRange = range.get(ctx);
    }

    @Override
    public void exitClassdeclaration(miniJavaParser.ClassdeclarationContext ctx) {
        currentRange = currentRange.getParentRange();
    }


    @Override
    public void enterVardeclaration(miniJavaParser.VardeclarationContext ctx) {
        String varname = ctx.identifier().getText();
    }

    static VarType getTypeFromTypeName(String typeName) {
        if (typeName.equals("int[]")) {
            return VarType.typeIntArray;
        }
        if (typeName.equals("boolean")) {
            return VarType.typeBoolean;
        }
        if (typeName.equals("int")) {
            return typeInt;
        }
        return VarType.typeClass;
    }

    @Override
    public void exitVardeclaration(miniJavaParser.VardeclarationContext ctx) {
    }

    @Override
    public void enterMethoddeclaration(miniJavaParser.MethoddeclarationContext ctx) {
        currentRange = range.get(ctx);
    }

    @Override
    public void exitMethoddeclaration(miniJavaParser.MethoddeclarationContext ctx) {
        currentRange = currentRange.getParentRange();
    }

    @Override
    public void enterIdentifier(miniJavaParser.IdentifierContext ctx) {
        try {
            String varname = ctx.IDENTIFIER().getText();

            if (currentRange.lookup(varname) == null) {
                System.err.println("variable or class not defined" + varname);
            }
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }

    static void printError(Token t, String msg) {
        System.err.printf("line %d:%d %s \n", t.getLine(), t.getCharPositionInLine(), msg);
    }

    @Override
    public void exitIfStatement(miniJavaParser.IfStatementContext ctx) {
        try {
            miniJavaParser.ExpressionContext exprCtx = ctx.expression();
            if ( (ctx.expression().getRuleIndex() != 6) &&(ctx.expression().getRuleIndex() != 7)) {
                printError(exprCtx.getStart(), "The condition of the If statement must be boolean expression.");
            }
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }

    @Override
    public void exitWhileStatement(miniJavaParser.WhileStatementContext ctx) {
        try {
            miniJavaParser.ExpressionContext exprCtx = ctx.expression();
            if ((ctx.expression().getRuleIndex() != 6) &&(ctx.expression().getRuleIndex() != 7)) {
                printError(exprCtx.getStart(), "The condition of the While statement must be boolean expression.");
            }
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }

    @Override
    public void exitPrintStatement(miniJavaParser.PrintStatementContext ctx) {
        try {
            miniJavaParser.ExpressionContext exprCtx = ctx.expression();
            switch (ctx.expression().getRuleIndex()) {
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    printError(exprCtx.getStart(), "The printed expression must be int/string/boolean expression.");
            }
        } catch (Exception e) {
            //printError(ctx.getStart(), e.getMessage());
        }
    }




    @Override
    public void exitClassExpr(miniJavaParser.ClassExprContext ctx) {
        try {
            Symbol symbol = currentRange.lookup(ctx.getText());
            if (symbol == null) {
                printError(ctx.getStart(), "The class " + ctx.getText() + " doesn't exist.");
            } else {
                switch (symbol.getSymbolType()) {
                    case classSymbol:
                        printError(ctx.getStart(), "Expected to get instance but class symbol " + ctx.getText() + ".");
                        break;
                    case methodSymbol:
                        printError(ctx.getStart(), "Expected to get class but method symbol " + ctx.getText() + ".");
                        break;
                    case varSymbol:
                        VarSymbol varSymbol = (VarSymbol) symbol;
                        switch (varSymbol.getVarType()) {
                            case typeClass:
                                exprType.put(ctx, varSymbol.getVarType());
                                exprClassSymbol.put(ctx, varSymbol.getClassType());
                                break;
                            default:
                                exprType.put(ctx, varSymbol.getVarType());
                        }
                }
            }
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }
    @Override
    public void exitThisExpr(miniJavaParser.ThisExprContext ctx) {
        exprType.put(ctx, VarType.typeClass);
        exprClassSymbol.put(ctx, currentRange.getClassSymbol());
    }

    @Override
    public void exitNewIntArrayExpr(miniJavaParser.NewIntArrayExprContext ctx) {
        try {
            if (exprType.get(ctx.expression()) != VarType.typeInt) {
                printError(ctx.expression().getStart(), "The index of the array must be Int.");
            }
            exprType.put(ctx, VarType.typeIntArray);
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }

    @Override
    public void exitNewClassInstanceExpr(miniJavaParser.NewClassInstanceExprContext ctx) {
        try {
            Symbol newInstance = currentRange.lookup(ctx.identifier().getText());
            if (newInstance == null) {
                printError(ctx.identifier().IDENTIFIER().getSymbol(), "The symbol " + ctx.identifier().getText() + " doesn't exist.");
            } else if (newInstance.getSymbolType() != Type.classSymbol) {
                printError(ctx.identifier().IDENTIFIER().getSymbol(), "The symbol " + ctx.identifier().getText() + " is not a class symbol.");
            } else {
                exprType.put(ctx, VarType.typeClass);
                exprClassSymbol.put(ctx, (ClassSymbol) newInstance);
            }
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }

    @Override
    public void exitNotExpr(miniJavaParser.NotExprContext ctx) {
        try {
            if (exprType.get(ctx.expression()) != VarType.typeBoolean) {
                printError(ctx.expression().getStart(), "! operator must be operated on boolean variable.");
            }
            exprType.put(ctx, VarType.typeBoolean);
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }

    @Override
    public void exitParenthesisExpr(miniJavaParser.ParenthesisExprContext ctx) {
        try {
            exprType.put(ctx, exprType.get(ctx.expression()));
            if (exprType.get(ctx.expression()) == VarType.typeClass) {
                exprClassSymbol.put(ctx, exprClassSymbol.get(ctx.expression()));
            }
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }

}