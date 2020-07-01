#java -cp antlr-3.5.2-complete.jar org.antlr.Tool myC_new.g
#javac -cp ./antlr-3.5.2-complete.jar myC_newLexer.java myC_newParser.java myC_new_test.java
##java -cp ./antlr-3.5.2-complete.jar:. myC_new_test test.c
CC = java
CC1 = javac

main: myC_new.g
	${CC} -cp antlr-3.5.2-complete.jar org.antlr.Tool myC_new.g
	${CC1} -cp ./antlr-3.5.2-complete.jar myC_newLexer.java myC_newParser.java myC_new_test.java

clean:
	rm *.class