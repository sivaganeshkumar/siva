import java.io.*;
import java.util.*;
class vowel
{
public static void main(String args[])
{
char vow;
Scanner s=new Scanner(System.in)
vow=s.nextChar();
if(vow='a'||vow='e'||vow='i'||vow='o'||vow='u')
System.out.println("Vowel");
else
System.out.println("Consonant");
}
}
