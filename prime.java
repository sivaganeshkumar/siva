 for(i=10;i<=100;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }if(i==j)
            {
         sum=0;       
        while(i!=0)
       {
          int b=i%10;
           i=i/10;
           sum+=b;
           
       }
                    System.out.println(""+sum);
   
       for(j=2;j<sum;j++)
       {
           if(sum%j==0)
           {
               break;
           }
       }
       if(sum==j)
       {
           System.out.println(""+i);
    }
}
}
