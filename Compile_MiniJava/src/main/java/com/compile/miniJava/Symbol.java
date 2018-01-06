package com.compile.miniJava;

import com.compile.miniJava.Type;

public class Symbol{
    private String name;
    private Type SymbolType;

    public Symbol(String name, Type SymbolType){
        this.name = name;
        this.SymbolType = SymbolType;

    }

    public String getName() {
        return name;
    }

    public Type getSymbolType(){
        return SymbolType;
    }
}