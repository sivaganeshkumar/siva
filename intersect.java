import java.util.Scanner;

public class IntersectDot
{
	public static void main(String args[])
	{
		int k=0,d=0;
		Scanner scr=new Scanner(System.in);
		int n1=scr.nextInt();
		int n2=scr.nextInt();
		for(int i=1;i<=n1-1;i++)
		   k+=i;
		for(int j=1;j<=n2-1;j++)
	          d+=k*j;
		System.out.println(d);
	}

}
