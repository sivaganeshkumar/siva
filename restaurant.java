import java.util.*;
public class restaurant
{
    public static void main(String args[])
    {
        int i,j,sum=0,s=0,refund=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ch[]=new int[n];
        for(i=0;i<n;i++)
        {
          ch[i]=sc.nextInt();  
        }
        int b=sc.nextInt();
        for(j=0;j<n;j++)
        {
            if(j!=k)
              sum=sum+ch[j];
        }
         if((sum/2)-b==0)
             System.out.println("Bon Appetit");
         else
             System.out.println(b-(sum/2));
    }
}
