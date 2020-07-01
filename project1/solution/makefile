#java -cp antlr-3.5.2-complete.jar org.antlr.Tool test1.g
#javac -cp ./antlr-3.5.2-complete.jar testLexer.java test1.java
##java -cp ./antlr-3.5.2-complete.jar:. testLexer input.c
SHELL = /bin/bash
CC = java
CC1 = javac

main: test1.g
	${CC} -cp antlr-3.5.2-complete.jar org.antlr.Tool test1.g
	${CC1} -cp ./antlr-3.5.2-complete.jar testLexer.java test1.java

clean:
	rm *.class