import java.util.*;
class Strlen
{
public static void main (String S[])
{
Scanner SC = new Scanner (System.in);
String s = SC.nextLine();
s=s+'\0';
byte b[] = s.getBytes();
int count = 0;
for(int i = 0;b[i]!='\0';i++)
{
count++;
}
System.out.println(count);
for(int i = 0;b[i]!='\0';i++)
{
if(b[i]>=97&&b[i]<=122)
{
b[i]=(byte)(b[i]-32);
}
}
String newS = new String(b);
System.out.println(newS);
}
}