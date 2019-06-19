class StringTest
{
public static void main(String S[])
{
String s1 = "abcd";
String s2 = "abc";
s2=s2+"d";
String s3 = "ABC";
String s4 = new String("abc");

System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);

s1 = s1.toUpperCase();
System.out.println(s1);
System.out.println(s1.length());
}
}