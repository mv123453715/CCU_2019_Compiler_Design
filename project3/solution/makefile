#java -cp antlr-3.5.2-complete.jar org.antlr.Tool myChecker.g
#javac -cp ./antlr-3.5.2-complete.jar myCheckerLexer.java myCheckerParser.java myChecker_test.java
##java -cp ./antlr-3.5.2-complete.jar:. myChecker_test test.c

CC = java
CC1 = javac

main: myChecker.g
	${CC} -cp antlr-3.5.2-complete.jar org.antlr.Tool myChecker.g
	${CC1} -cp ./antlr-3.5.2-complete.jar myCheckerLexer.java myCheckerParser.java myChecker_test.java

clean:
	rm *.class