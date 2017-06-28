public class a
{
public static void main(string[] args)
{
Sacnner s=new Scanner(System.in);
String ch=s.next();
String ch1=s.next();
char a[]=ch.toLowerCase.toCharArray();
char b[]=ch1.toLowercase.toCharArray();
if(a.length==b.length)
{
Arrays.sort(a);
arrays.sort(b);
if(Arrays.equals(a,b));
{
System.out.println("anagram");
}
else
{
System.out.println("not anagram");
}
}
else
System.out.println("length ineuality");
}
