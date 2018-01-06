package com.compile.miniJava;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

public class BuildPhase extends miniJavaBaseListener {
    Block globalBlock;
    Range currentRange;
    ParseTreeProperty<Range> range = new ParseTreeProperty<>();
    Map<ClassSymbol, Range> classRange = new HashMap<>();

    public ParseTreeProperty<Range> getScopes() {
        return range;
    }

    public Block getGlobalScope() {
        return globalBlock;
    }

    public Map<ClassSymbol, Range> getClassScopes() {
        return classRange;
    }


    @Override
    public void enterGoal(miniJavaParser.GoalContext ctx) {
        globalBlock = new Block(null);
        currentRange = globalBlock;
        range.put(ctx, currentRange);
    }

    @Override
    public void exitGoal(miniJavaParser.GoalContext ctx) {
        currentRange = currentRange.getParentRange();
    }

    @Override
    public void enterMainclass(miniJavaParser.MainclassContext ctx) {
        String Mainclassname = ctx.identifier(0).getText();
        ClassSymbol MainclassSymbol = new ClassSymbol(Mainclassname);
        currentRange.add(MainclassSymbol);
        currentRange = new Block(currentRange, MainclassSymbol);
        currentRange.add(new VarSymbol(ctx.identifier(1).getText(),VarType.typeStringArray));
        range.put(ctx, currentRange);
        classRange.put(MainclassSymbol,currentRange);
    }

    @Override
    public void exitMainclass(miniJavaParser.MainclassContext ctx) {
        currentRange = currentRange.getParentRange();
    }

    @Override
    public void enterClassdeclaration(miniJavaParser.ClassdeclarationContext ctx) {
        String classname = ctx.identifier(0).getText();
        ClassSymbol classSymbol = new ClassSymbol(classname);
        currentRange.add(classSymbol);
        currentRange = new Block(currentRange, classSymbol);
        //继承未处理currentRange.add(new VarSymbol(ctx.identifier(1).getText(),VarType.typeStringArray));
        range.put(ctx, currentRange);
        classRange.put(classSymbol,currentRange);
    }

    @Override
    public void exitClassdeclaration(miniJavaParser.ClassdeclarationContext ctx) {
        currentRange = currentRange.getParentRange();
    }

    @Override
    public void enterVardeclaration(miniJavaParser.VardeclarationContext ctx) {
        String varname = ctx.identifier().getText();
        if(currentRange.lookupinside(varname) != null) {
            printError(ctx.identifier().IDENTIFIER().getSymbol(), "duplicate defination of '" + varname + "'");

        }
        String type = ctx.type().getText();
        VarType varType = getTypeFromTypeName(type);
        if(varType != VarType.typeClass)
            currentRange.add(new VarSymbol(varname, varType));
        else currentRange.add(new VarSymbol(varname, new ClassSymbol(type)));
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
        String methodname = ctx.identifier(0).getText();
        String returnTypeName = ctx.type(0).getText();
        VarType varType = getTypeFromTypeName(returnTypeName);
        MethodSymbol methodSymbol;
        if(varType != VarType.typeClass)
            methodSymbol = new MethodSymbol(methodname, varType);
        else {
            methodSymbol = new MethodSymbol(methodname, new ClassSymbol(returnTypeName));
        }
        currentRange.add(methodSymbol);
        String parameter = ctx.identifier(1).getText();
        String parameterTypeName = ctx.type(1).getText();
        VarType parameterType = getTypeFromTypeName(parameterTypeName);
        if(varType != VarType.typeClass)
            methodSymbol = new MethodSymbol(parameter, parameterType);
        else {
            methodSymbol = new MethodSymbol(parameter, new ClassSymbol(parameterTypeName));
        }
        currentRange.add(methodSymbol);
        currentRange = new Block(currentRange);
        range.put(ctx, currentRange);
    }

    @Override
    public void exitMethoddeclaration(miniJavaParser.MethoddeclarationContext ctx) {
        currentRange = currentRange.getParentRange();
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
