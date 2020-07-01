;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 1000
.limit locals 1000
ldc 5
istore_1
ldc 7
istore_0
; print the value.
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a = 5 , b = 7"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload_1
iload_0
if_icmple L1
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
iload_1
iload_0
if_icmpge L3
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
iload_1
iload_0
if_icmpne L5
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
iload_1
iload_0
if_icmpeq L7
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
iload_1
iload_0
if_icmplt L9
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
iload_1
iload_0
if_icmpgt  L11
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
