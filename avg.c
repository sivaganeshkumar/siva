include<stdio.h>
#include<conio.h>
int main()
{
int a[50],b,i,j,n=0,c=0,d=0,e,f;
clrscr();
printf("Enter the numbers:");
scanf("%d",&b);
for(i=0;i<b;i++)
{
scanf("%d",&a[i]);
}
for(j=0;j<b/2;j++)
{
c=c+a[i];
n++;
}
for(i=b/2;i<b;i++)
{
d=d+a[i];
}
e=c/n;
f=d/n;
if(e==f)
{
printf("Possible");
}
else
printf("Not possible");
getch();
return 0;
}
