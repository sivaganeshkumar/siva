#include<stdio.h>
#include<conio.h>
void main()
{
char c1[10],c2[10];
int i;
printf("Enter the two string ");
scanf("%s%s",c1,c2);
for(i=0;i<strlen(c1);i++)
printf("%c",c1[i]+10);
printf("\n");
printf("%c",c2[0]);
for(i=1;i<strlen(c2)-1;i++)
{
    c2[i]=c2[i]+10;
    if(c2[i]>122)
        printf("%c",(c2[i]-122)+97-1);
    else
        printf("%c",c2[i]);
}
printf("%c",c2[strlen(c2)-1]);
}
