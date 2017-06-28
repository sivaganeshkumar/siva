package milestone3lc;

public class productofnum {
    
    public static void main(String[] args)
    {
        int a,b,c=0;
        for(b=0;b<50;b++)
        {
        for(a=0;a<50;a++)
        {
            if(a+b==25 && a-b==13)
            {
                System.out.println(a+" "+b);
               c=a*b; 
            }
        }
    }
        System.out.println("Product is:"+c);
}
}
