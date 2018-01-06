package com.compile.miniJava;

public interface Range {
    Range getParentRange();

    ClassSymbol getClassSymbol();

    void add(Symbol sym);

    Symbol lookup(String name);
}
