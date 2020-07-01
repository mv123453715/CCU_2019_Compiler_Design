;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 1000
.limit locals 1000
ldc 0
istore_2
ldc 0.0
fstore_0
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Test1 int float is OK!\n"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
