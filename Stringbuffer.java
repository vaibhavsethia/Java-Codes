class Stringbuffer
{
public static void main(String S[])
{
StringBuffer str = new StringBuffer("abcd");
System.out.println(str);
str = str.append("def");
System.out.println(str);
str = str.insert(2,"XYZ");
System.out.println(str);
str = str.delete(2,7);
System.out.println(str);
StringBuffer str1 = new StringBuffer("Abcd");
str1 = str1.append("def").insert(3,"PQR").delete(3,5);
System.out.println(str1);
}
}