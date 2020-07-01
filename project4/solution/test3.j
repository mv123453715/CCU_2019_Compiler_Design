;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 1000
.limit locals 1000
ldc 0.5
fstore_1
ldc 0.7
fstore_0
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a = 0.5 , b = 0.7"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
fload_1
fload_0
fcmpl
ifle L1
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a >b is OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L2
L1:
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a >b is not OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L2:
fload_1
fload_0
fcmpl
ifge L3
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a <b is OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L4
L3:
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a <b is not OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L4:
fload_1
fload_0
fcmpl
ifne L5
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a == b is OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L6
L5:
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a == b is not OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L6:
fload_1
fload_0
fcmpl
ifeq L7
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a != b is OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L8
L7:
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a != b is not OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L8:
fload_1
fload_0
fcmpl
iflt L9
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a >=b is OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L10
L9:
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a >=b is not OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L10:
fload_1
fload_0
fcmpl
ifgt L11
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a <= b is OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L12
L11:
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a <= b is not OK!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L12:
return
.end method
