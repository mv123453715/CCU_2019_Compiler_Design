#java -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
#javac -cp ./antlr-3.5.2-complete.jar myCompilerLexer.java myCompilerParser.java myCompiler_test.java
#java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test test1.c > test1.j
#java -jar jasmin.jar test1.j
#java myResult


CC = java
CC1 = javac

main: myCompiler.g
	${CC} -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	${CC1} -cp ./antlr-3.5.2-complete.jar myCompilerLexer.java myCompilerParser.java myCompiler_test.java

clean:
	rm *.class