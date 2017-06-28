#include<stdio.h>
void char_num(char num[3],int a)
{
if(a>0)
{
num[3-a]='0';
char_num(num,a-1);
num[3-a]='1';
char_num(num,a-1);
}
else
printf("%s \n",num);
}
void main()
{
char num[4]={0};
int a;
scanf("%d",&a);
char_num(num,a);

}
