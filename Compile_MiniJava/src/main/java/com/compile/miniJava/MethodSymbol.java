package com.compile.miniJava;

public class MethodSymbol extends Symbol{
    VarType returnType;
    ClassSymbol classType;

    public MethodSymbol(String name, VarType varType) {
        super(name, Type.varSymbol);
        this.returnType = varType;
    }

    public MethodSymbol(String name, ClassSymbol classSymbol) {
        super(name, Type.varSymbol);
        this.returnType = VarType.typeClass;
        this.classType = classSymbol;

    }
    public ClassSymbol getClassType() {
        return classType;
    }

    public VarType getreturnType() {
        return returnType;
    }
}
