class StringConstructors
{
public static void main(String S[])
{
byte b[] = {65,66,67,68,69};
String str = new String(b);
char ch[] = {'a','b','c','d','e'};
String str1 = new String(ch);
System.out.println(str);
System.out.println(str1);
}
}