#include <stdio.h>



void fun1( int a ,int b ){
    return a +b;
}//fun1


void fun2( int a ,int b ){
    return a -b;
}//fun2


void fun3( int a ,int b ){
    return a *b;
}//fun3


void fun4( int a ,int b ){
    return a /b;
}//fun4



int main()
{
    int a,b,c;
    c = fun1(a,b);
    c = fun2(a,b);
    c = fun3(a,b);
    c = fun4(a,b);
    
}//main()
