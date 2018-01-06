package com.compile.miniJava;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.Map;

public class CheckPhase extends miniJavaBaseListener{
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


    @Override public void enterVardeclaration(miniJavaParser.VardeclarationContext ctx) {
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
            return VarType.typeInt;
        }
        return VarType.typeClass;
    }

    @Override public void exitVardeclaration(miniJavaParser.VardeclarationContext ctx) {
    }

    @Override public void enterMethoddeclaration(miniJavaParser.MethoddeclarationContext ctx) {
        currentRange = range.get(ctx);
    }

    @Override
    public void exitMethoddeclaration(miniJavaParser.MethoddeclarationContext ctx) {
        currentRange = currentRange.getParentRange();
    }

    @Override public void enterIdentifier(miniJavaParser.IdentifierContext ctx) {
        String varname = ctx.IDENTIFIER().getText();
        if(currentRange.lookup(varname) == null) {
            System.err.println("variable or class not defined" + varname);
        }
    }
}
