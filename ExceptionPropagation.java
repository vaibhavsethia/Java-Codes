class ExceptionPropagation
{
public static void main (String S[])
{
System.out.println("Welcome To Main");
try
{
int a = Integer.parseInt(S[0]);
int b = Integer.parseInt(S[1]);
div(a,b);
}
catch(ArithmeticException e)
{
e.printStackTrace();
}
finally
{
System.out.println("Finally in Main");
}
}
static void div(int a,int b)
{
System.out.println("Welcome To div");
try
{
int c = a/b;
}
catch(NumberFormatException e)
{
e.printStackTrace();
}
finally
{
System.out.println("Finally");
}
System.out.println("Thank you by div");
}
}