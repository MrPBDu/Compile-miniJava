Enviroment/Tools Needed:

       IntelliJ IDEA, ANTLR v4

       Please install ANTLR v4 plug-in in IntelliJ IDEA and add the ANTLR4.jar in "Setting -> Dependency"


How to use this project:

       1. To See the AST, 
          right click 'goal' in miniJava.g4, choose test rule goal and add the file or code.
          This would also shows lexer and parser error.
   
       2. To check the Lexer/ Parser/ Sementic Error,
          please edify the file path in 'test.java'(Using the absolute path) and run test.
   

Work Division:

        Du Fang: Construction of Sementic Error detection, 
                 re-define type/ method/ class for above usage
                 write and edify function in CheckPhase.
                 Write Report on his part.

        Luo Sicheng: Build the enviroment.
                     AST build.
                     Write BuildPhase and edify CheckPhase
                     Optimize error printer
                     Write report on his part.
