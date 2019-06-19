class ExceptionPropagationHW
{
public static void main (String S[])
{
System.out.println("Welcome To Main");
try
{
div(S[0],S[1]);
}
catch(NumberFormatException n)
{
n.printStackTrace();
}
catch(ArrayIndexOutOfBoundsException e)
{
e.printStackTrace();
}
finally
{
System.out.println("Finally in Main");
}
}
static void div(String a,String b)
{
try
{
System.out.println("Welcome To div");
int x = Integer.parseInt(a);
int y = Integer.parseInt(b);
m1(x,y);
}
catch(ArithmeticException ae)
{
ae.printStackTrace();
}
finally
{
System.out.println("Finally");
}
System.out.println("Thank you by div");
}
static void m1(int x,int y)
{
try
{
int z = x/y;
}
finally
{
System.out.println("Finally in m1");
}
}
}