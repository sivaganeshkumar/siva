
import java.util.*;
import java.lang.*;
import java.io.*;


class palindrom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String pali=new String();
		int length=0;
		for(int i=0;i<s.length();i++)
		{
		    for(int j=i+1;j<s.length();j++)
		    {
		        String temp=s.substring(i,j);
		        if(temp.equalsIgnoreCase(String.valueOf(new StringBuffer(temp).reverse())))
		        {
		            if(temp.length()>length)
		            {
		                length=temp.length();
		                pali=new String(temp);
		            }
		        }
		    }
		}
		System.out.println(pali);
	}
}
