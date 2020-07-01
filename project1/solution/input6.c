#include <stdio.h>

int main()
{
    int a=0,b,c;
    if ( a == b )
      c++;

    if ( a <= b )
      c--;
      
    if ( a >= b )
      c++;

    if ( a > b )
      c++;
      
    if ( a < b )
      printf( "a left shift 2 %d \n",a << 2 );

    if ( a != b )
      printf( "a right shift 2 %d \n",a >> 2 );
      
    if ( a == b )
      c--;  

    if ( a == b )
      printf( "c address is %d \n",&c );    
    
    char *a;  
    
  
}//main()

