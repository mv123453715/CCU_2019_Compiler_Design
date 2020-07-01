;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 1000
.limit locals 1000
ldc 2
istore_0
iload_0
ldc 2
ldc 100
ldc 1
isub
imul
iadd
istore_1
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Test2 Statements for arithmetic computation OK!\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
