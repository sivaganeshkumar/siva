#include <stdio.h>

void main()
{
    int n,i,hash[100000]={0},flag=0;
    printf("enter the number of elements  array");
    scanf("%d",&n);
    if(n%2==0)
     printf("plz give an odd count!!");
     else
     {
          int a[n];
          printf("enter the elements in the array");
          for(i=0;i<n;i++)
          {
            scanf("%d",&a[i]);
            hash[a[i]]++;
          }
              for(i=0;i<n;i++)
              {
                    if(hash[a[i]]>=1)
                     {
                        printf("%d",a[i]); flag=1;
                       break;
                       
                     }
              }
              if(flag==0)
              printf("there is no unique element in the array.");
     }
  
   
}
