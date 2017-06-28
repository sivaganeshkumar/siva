#include<stdio.h>
void main()
{
int a,b,c;
printf("Enter the number");
scanf("%d",&c);
if(c<3)
{
printf("%d",c);
}
if(c<5&&c>=3)
{
a=a%3+a/3;
printf("%d",a);
}
if(c>=5)
{
b=b%3+b/3;
printf("%d",b);
}

}
