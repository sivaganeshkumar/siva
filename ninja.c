#include <stdio.h>
void char_num(char num[3], int n) 
{
    if(n > 0) 
    {
        num[3-n] = '0';
        char_num(num, n - 1);
        num[3-n] = '1';
        char_num(num, n - 1);
    }
    else 
        printf("%s\n", num);
}
void main() 
{
    char num[4] = {0};
    int n;
    scanf("%d",&n);
    char_num(num,n);
    
}
