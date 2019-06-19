class GetBytesFunction
{
public static void main (String S[])
{
String str = "abcdef";
byte b[] = str.getBytes();
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
}
}
