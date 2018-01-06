package com.compile.miniJava;

import java.util.HashMap;
import java.util.Map;

public class Block implements Range {
    Range ParentRange;
    Map<String, Symbol> symbols = new HashMap<>();
    ClassSymbol classSymbol;

    public Block(Range ParentRange){
        this.ParentRange = ParentRange;
        if (ParentRange != null) {
            this.classSymbol = ParentRange.getClassSymbol();
        }
    }

    public Block(Range ParentRange, ClassSymbol classSymbol) {
        this.ParentRange = ParentRange;
        this.classSymbol = classSymbol;
    }

    @Override
    public Range getParentRange(){
        return ParentRange;
    }

    @Override
    public ClassSymbol getClassSymbol(){
        return classSymbol;
    }

    @Override
    public void add(Symbol sym){
        symbols.put(sym.getName(), sym);
    }

    @Override
    public Symbol lookup(String name){
        Symbol symbol = symbols.get(name);
        if(symbol != null)
            return symbol;
        else if(ParentRange != null){
            return ParentRange.lookup(name);
        }
            return null;
    }

    @Override
    public Symbol lookupinside(String name){
        Symbol symbol = symbols.get(name);
        if(symbol != null)
            return symbol;
        return null;
    }
}
