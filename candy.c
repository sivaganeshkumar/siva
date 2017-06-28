#include<stdio.h>
#include<conio.h>
int main()
{
int n,count=0,i=0,sum=0,r[10];

clrscr();

printf("enter the number of children");

scanf("%d",&n);

printf("enter the rating of the each children");

for(i=0;i<n;i++)

{

scanf("%d",&r[i]);

}
{
for(i=0;i<n;i++)
{
if(r[i]<r[i+1])
{
count=count+1;
sum=sum+count;
}
else
sum=sum+count;
}
}
printf("minimum candies%d",sum);

getch();
return 0;
}
