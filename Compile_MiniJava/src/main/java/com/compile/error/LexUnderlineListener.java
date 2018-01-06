package com.compile.error;

import org.antlr.v4.runtime.*;

public class LexUnderlineListener extends BaseErrorListener {
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        underlineError(recognizer,(Token)offendingSymbol,
                line, charPositionInLine);
    }
    protected void underlineError(Recognizer recognizer,
                                  Token offendingToken, int line,
                                  int charPositionInLine) {
        CharStream tokens =
                (CharStream)recognizer.getInputStream();
        String input = tokens.toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
        int i=charPositionInLine;
        System.err.print("^");
        System.err.println();
    }
}