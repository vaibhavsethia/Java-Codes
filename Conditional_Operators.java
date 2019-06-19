class Conditional_Operators
{
public static void main (String s[])
{
int a=10,b=20,c=30,large;
large=a>b?(a>c?a:c):(b>c?b:c);
System.out.println(large);
}
}