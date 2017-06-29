#include<stdio.h>
#include<conio.h>
void abc(char num[3],int i)
{
if(i>0)
{
num[3-i]='0';
abc(num,i-1);
num[3-i]='1';
abc(num,i-1);
}
else
printf("%s\n",num);
}
int main()
{
char num[]={0};
int i;
scanf("%d",&i);
abc(num,i);
getch();
return 0;
}
