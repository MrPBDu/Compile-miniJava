grammar miniJava;
goal : mainclass ( classdeclaration )* EOF;
mainclass : 'class' identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}';
classdeclaration : 'class' identifier ( 'extends' identifier )? '{' ( vardeclaration )* ( methoddeclaration )* '}';
vardeclaration : type identifier ';';
methoddeclaration : 'public' type identifier '(' ( type identifier ( ',' type identifier )* )? ')' '{' ( vardeclaration )* ( statement )* 'return' expression ';' '}';
type : 'int' '[' ']'
| 'boolean'
| 'int'
| identifier;
statement : '{' ( statement )* '}'
| 'if' '(' expression ')' statement 'else' statement
| 'while' '(' expression ')' statement
| 'System.out.println' '(' expression ')' ';'
| identifier '=' expression ';'
| identifier '[' expression ']' '=' expression ';';
expression : expression ( '&&' | '<' | '+' | '-' | '*' ) expression
|expression '[' expression ']'
|expression '.' 'length'
|expression '.' identifier '(' ( expression ( ',' expression )* )? ')'
|INTEGER_LITERAL
|'true'
|'false'
|identifier
|'this'
|'new' 'int' '[' expression ']'
|'new' identifier '(' ')'
|'!' expression
|'(' expression ')';
//expression : INTEGER_LITERAL
//| 'true' expressionright
//| 'false'expressionright
//| identifier expressionright
//| 'this'expressionright
//| 'new' 'int' '[' expression ']' expressionright
//| 'new' identifier '(' ')' expressionright
//| '!' expression expressionright
//| '(' expression ')';
//expressionright :  ( '&&' | '<' | '+' | '-' | '*' ) expressionright
//| '[' expressionright ']'
//| '.' 'length'
//|'.'identifier'('( expressionright(','expressionright)*)?')'
//|;
identifier : IDENTIFIER;
//CLASS : 'class';
//LEFTBRACE :  '{';
//PUBLICTOKEN : 'public';
//STATIC : 'static';
//VOID : 'void';
//MAIN : 'main';
//LEFTPARENTHESES : '(';
//STRING : 'String';
//LEFTBRACKET : '[';
//RIGHTBRACKET : ']';
//RIGHTPARENTHESES : ')';
//RIGHTBRACE : '}';
//EXTENDS : 'extends';
//SEMICOLON : ';';
//RETURN : 'return';
//COMMA  : ',';
//INT : 'int';
//BOOLEAN : 'boolean';
//EQUALSIGN : '=';
//IF : 'if';
//ELSE : 'else';
//WHILE : 'while';
//PRINTLN : 'System.out.println';
//CONJUNCTION : '&&';
//LESS : '<';
//ADD : '+';
//MINUS : '-';
//MULTIPLY : '*';
//POINT : '.';
//LENGTH : 'length';
//TRUE : 'true';
//FALSE : 'false';
//THIS : 'this';
//NEW : 'new';
//NEGATE : '!';
IDENTIFIER : [_a-zA-Z][_a-zA-Z0-9]*;
INTEGER_LITERAL : [0-9]+;
LINECOMMENT : '//'[^\n]* -> skip;
COMMENT:'/*'( [\f\n\r\t]|.)*?'*/'-> skip;
WS : [ \t\n\r]+ -> skip;