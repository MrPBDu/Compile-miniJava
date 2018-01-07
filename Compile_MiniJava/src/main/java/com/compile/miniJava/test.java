package com.compile.miniJava;
import com.compile.error.LexUnderlineListener;
import com.compile.error.UnderlineListener;
import com.compile.error.VerboseListener;
import com.compile.miniJava.miniJavaLexer;
import com.compile.miniJava.miniJavaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class test{
    public static void main (String[] args)throws IOException, FileNotFoundException {
//        File directory = new File("");
//        FileInputStream is = new FileInputStream(directory);
//        ANTLRInputStream input = new ANTLRInputStream(is);

        File file = new File("D:\\download\\factorial.java");
        FileInputStream fis = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(fis);

        //A lexer object for lexing(tokenizing) the file input stream.

        miniJavaLexer lexer = new miniJavaLexer(input);
        lexer.addErrorListener(new LexUnderlineListener());


        //A stream view of the tokenized file, built by the lexer

        CommonTokenStream tokens = new CommonTokenStream(lexer);



        //The parser taking the token stream for parse tree construction.

        miniJavaParser parser = new miniJavaParser(tokens);

        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new VerboseListener()); // add ours
        parser.addErrorListener(new UnderlineListener());

        ParseTree tree = parser.goal();

        ParseTreeWalker walker = new ParseTreeWalker();
        BuildPhase b = new BuildPhase();
        walker.walk(b, tree);
        CheckPhase c = new CheckPhase(b.globalBlock,b.range,b.getClassScopes());
        walker.walk(c, tree);

//        System.out.println(tree.getText());
//        System.out.println(tree.getChild(0).getText());
//        System.out.println(tree.getChild(1).getText());
    }
}