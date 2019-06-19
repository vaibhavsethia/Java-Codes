import java.util.*;
class StringHWCount
{
public static void main(String S[])
{
int caps = 0,small = 0,space = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String");
String str = sc.nextLine();
char c[] = str.toCharArray();
for(int i=0;i<c.length;i++)
{
if(c[i]>=65&&c[i]<=90)
{
caps++;
}
else if(c[i]>=97&&c[i]<=122)
{
small++;
}
else if(c[i]==' ')
{
space++;
}
}
System.out.println("Caps : "+caps+"\nSmall : "+small+"\nSpaces : "+space);
}
}