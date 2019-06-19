class StringEquals
{
public static void main (String S[])
{
String str = "abcde";
String str1	 = "abcde";
System.out.println(str.equals(str1));
str1 = "ABCDE";
System.out.println(str.equals(str1));
System.out.println(str.equalsIgnoreCase(str1));
}
}