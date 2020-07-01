;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 1000
.limit locals 1000
ldc 5
istore_1
ldc 0.5
fstore_0
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "HELLO WORLD"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
iload_1
invokevirtual java/io/PrintStream/println(I)V
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
fload_0
invokevirtual java/io/PrintStream/println(F)V
return
.end method
