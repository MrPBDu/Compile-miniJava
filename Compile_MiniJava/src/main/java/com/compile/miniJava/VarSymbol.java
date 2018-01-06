package com.compile.miniJava;

import com.compile.miniJava.Symbol;
import com.compile.miniJava.Type;
import com.compile.miniJava.VarType;

public class VarSymbol extends Symbol {
    VarType varType;
    ClassSymbol classType;

    public VarSymbol(String name, VarType varType) {
        super(name, Type.varSymbol);
        this.varType = varType;
    }

    public VarSymbol(String name, ClassSymbol classSymbol) {
        super(name, Type.varSymbol);
        this.varType = VarType.typeClass;
        this.classType = classSymbol;

    }
    public ClassSymbol getClassType() {
        return classType;
    }

    public VarType getVarType() {
        return varType;
    }
}