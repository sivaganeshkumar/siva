import java.util.*;
public class alexfrnd
{
    public static void main(String args[])
    {
        int i,m,l=0,l1=0,flag=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        sc.nextLine();
        int ch[]=new int[k];
        for(i=0;i<k;i++)
            ch[i]=sc.nextInt();
        for(m=0;m<ch.length;m++)
        {
          l1=ch[m];
          l=l1-1;
          if(s.charAt(l)==0)
           {
               flag++;
           }
        }
        if(flag!=0)
        {
            System.out.println("YES");
        }
        else
        System.out.println("NO");
        sc.close();
    }
}
