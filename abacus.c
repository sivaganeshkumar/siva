#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
float a,b,c,d,x[20],y[20],sum=0,itgl;
int j;
clrscr();
printf("value of b,c,d");
scanf("%f%f%f",&b,&c,&d);
printf("value of x");
for(i=0;i<=n;i++)
{
scanf("%f",&x[i]);
}
printf("\n value of y");
for(i=0;i<=n;i++)
{
scanf("%f",&y[i]);
}
a=[c-b)/n;
b=x[0];
c=x[n];
for(i=0;i<=n-2);i++)
{
y[i]=x[i]+h;
if(i%2==0)
{
sum=sum+4*y[i];
}
else
{
sum=sum+2*y[i];
}
}
itgl=sum*(a/3);
printf("integral value %f",itgl);
getch();
}
