package com.compile.miniJava;

import org.antlr.v4.runtime.CharStream;
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

        if(ctx.identifier().size()>1){
            String inheritclassname = ctx.identifier(1).getText();
            if(inheritclassname == null || classRange.get(inheritclassname) == null)
                printError(ctx.identifier(1).IDENTIFIER().getSymbol(),"inherit class '" + inheritclassname + "' doesn't exist");
        }

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
                printError(ctx.IDENTIFIER().getSymbol(),"variable or class not defined '" + varname + "'");
            }
        } catch (Exception e) {
            printError(ctx.getStart(), "Compiler met an unrecognizable error.");
        }
    }

    static void printError(Token t, String msg) {
        System.err.printf("line %d:%d %s \n", t.getLine(), t.getCharPositionInLine(), msg);
        CharStream tokens =
                (CharStream)t.getInputStream();
        String input = tokens.toString();
        String[] lines = input.split("\n");
        String errorLine = lines[t.getLine() - 1];
        System.err.println(errorLine);
        for (int i=0; i<t.getCharPositionInLine(); i++) System.err.print(" ");
        int i =t.getCharPositionInLine();
        System.err.print("^");
        System.err.println();
    }

}