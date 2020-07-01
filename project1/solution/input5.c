#include <stdio.h>

int main()
{
    int i = 2,j = 3,k = 4,score = 100 ;
    while ( i >0 )
      i--;
    if ( j ==3 )
      k++;
    else
      k--;
      
    for ( i = 0 ; i < 50 ; i++ ){
      if ( i == 5 )
        break;
      else if ( i == 2 )
        continue;
    }//for
    
    switch(score / 10) { 
        case 10: case 9: 
            printf("get A"); 
            break; 
        case 8: 
            printf("get B"); 
            break; 
        case 7: 
            printf("get C"); 
            break; 
        case 6: 
            printf("get D"); 
            break; 
        default: 
            printf("get E"); 
            break;
    }     
      
      
    
}//main()



    (a)while
    (b)if
    (c)else
    (d)for
    (e)break
    (f)continue
    (g)switch
    (h)case
    (i)default