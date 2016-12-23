import java.io.*;
import  java.util.*;

class UserMainCode
{
	public int howManyPrimeNumsWillGet(int input1){
	  int f=0,x=0,s=0,d=0,kl=0; int[] ar=new int[100];
	  
	  for(int i=2;i<input1;i++){
		if(input1%i==0){
		  f++;
		  break;
		}}
	
        
	  for(int i=11,h=0;i<=99&&h<=99;i++,h++){
		int c=0;
		for(int num=i;num>=1;num--){
		  if(i%num==0)
			{
			c=c+1;
		  }
		}
		if(c==2){
		 ar[h]=i;kl=kl+1;
		}
	  }
	     //     System.out.println(""+kl);
  for(int i=0;i<=25;i++)
	{
	for(int j=0;j<=25;j++){
            s=ar[i]+ar[j];
            if(f==0&&s==input1){x++;System.out.println("1");
		return 1;}
                if(s==input1){
		x++;System.out.println("2");
		return 2;}
        }}
  for(int i=0;i<=25;i++)
	{
	for(int j=0;j<=25;j++){
	 for(int b=0;b<=25;b++){
              s=ar[i]+ar[j]+ar[b];
		if(s==input1){
		  x++;System.out.println("3");
		  return 3;}
         }
        }
        }
       for(int i=0;i<=25;i++)
	{
	for(int j=0;j<=25;j++){
	 for(int b=0;b<=25;b++){
           for(int e=0;e<=25;e++){
               s=ar[i]+ar[j]+ar[b]+ar[e];
		if(s==input1){
		  x++;System.out.println("4");
		  return 4;}
           }
         }
        }
        }
     for(int i=0;i<=25;i++)
	{
	for(int j=0;j<=25;j++){
	 for(int b=0;b<=25;b++){
           for(int e=0;e<=25;e++){
            for(int a=0;a<=25;a++){
                     s=ar[i]+ar[j]+ar[b]+ar[e]+ar[a];
		if(s==input1){
		  x++;System.out.println("5");
		  return 5;}
            }
           }
         }
        }
        }
       for(int i=0;i<=25;i++)
	{
	for(int j=0;j<=25;j++){
	 for(int b=0;b<=25;b++){
           for(int e=0;e<=25;e++){
            for(int a=0;a<=25;a++){
            for(int z=0;z<=25;z++){
                     s=ar[i]+ar[j]+ar[b]+ar[e]+ar[a]+ar[z];
		if(s==input1){
		  x++;System.out.println("6");
		  return 6;  }
            }}}}}}
         for(int i=0;i<=25;i++)
	{
	for(int j=0;j<=25;j++){
	 for(int b=0;b<=25;b++){
           for(int e=0;e<=25;e++){
            for(int a=0;a<=25;a++){
            for(int z=0;z<=25;z++){
           for(int v=0;v<=25;v++){
                s=ar[i]+ar[j]+ar[b]+ar[e]+ar[a]+ar[z]+ar[v];
		if(s==input1){
		  x++;System.out.println("7");
		  return 7;}}
            }}}}}}
            for(int i=0;i<=25;i++)
	{
	for(int j=0;j<=25;j++){
	 for(int b=0;b<=25;b++){
           for(int e=0;e<=25;e++){
            for(int a=0;a<=25;a++){
            for(int z=0;z<=25;z++){
           for(int v=0;v<=25;v++){
             for(int o=0;o<=25;o++){
                 s=ar[i]+ar[j]+ar[b]+ar[e]+ar[a]+ar[z]+ar[v]+ar[o];
		if(s==input1){
		  x++;System.out.println("8");
		  return 8;}}}}}}}}}
           for(int i=0;i<=25;i++)
	{
	for(int j=0;j<=25;j++){
	 for(int b=0;b<=25;b++){
           for(int e=0;e<=25;e++){
            for(int a=0;a<=25;a++){
            for(int z=0;z<=25;z++){
           for(int v=0;v<=25;v++){
             for(int o=0;o<=25;o++){
                 for(int y=0;y<=25;y++){
                     s=ar[i]+ar[j]+ar[b]+ar[e]+ar[a]+ar[z]+ar[v]+ar[o]+ar[y];
		if(s==input1){
		  x++;System.out.println("9");
		  return 9;}
                 }
             }
           }
            }
            }
           }
         }
        }
        }
  	if(x==0){System.out.println("-1");
	  return -1;}
	  return 0;
	}
  public static void main(String[] args){
      UserMainCode r=new UserMainCode();
      r.howManyPrimeNumsWillGet(121);
  }
}
