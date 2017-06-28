#include <stdio.h>
 
void tower(int, char, char, char);
 
int main()
{
    int n;
    printf("Enter the no.of disks : ");
    scanf("%d", &n);
    printf("The sequence of moves  :\n");
    tower(n, 'A', 'C', 'B');
    return 0;
}
void tower(int n, char frompeg, char topeg, char auxpeg)
{
    if (n == 1)
    {
        printf("\n Move disk 1 from peg %c to peg %c", frompeg, topeg);
        return;
   }
    tower(n - 1, frompeg, auxpeg, topeg);
    printf("\n Move disk %d from peg %c to peg %c", n, frompeg, topeg);
    tower(n - 1, auxpeg, topeg, frompeg);
}
