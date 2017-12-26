package com.compile.miniJava;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class test{
    public static void main (String[] args)throws IOException, FileNotFoundException {
        //InputStream is = null;
        //is.read();
        //ANTLRInputStream input = new ANTLRInputStream(is);
        FileInputStream is = new FileInputStream("D:\\Download\\Factorial.java");
        ANTLRInputStream input = new ANTLRInputStream(is);

        //A lexer object for lexing(tokenizing) the file input stream.

        miniJavaLexer lexer = new miniJavaLexer(input);



        //A stream view of the tokenized file, built by the lexer

        CommonTokenStream tokens = new CommonTokenStream(lexer);



        //The parser taking the token stream for parse tree construction.

        miniJavaParser parser = new miniJavaParser(tokens);


        ParseTree tree = parser.goal();
        System.out.println(tree.getText());
        System.out.println(tree.getChild(0).getText());
        System.out.println(tree.getChild(1).getText());
    }
}