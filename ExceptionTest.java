class ExceptionTest
{
public static void main (String S[])
{
System.out.println("Entered Main");
int a,b,c=0;
try
{
a = Integer.parseInt(S[0]);
b = Integer.parseInt(S[1]);
if(b==0)
{
throw new ArithmeticException();
}
System.out.println("Entered Try");
c = a/b;
System.out.println(c);
}
catch(NumberFormatException e)
{
System.out.println("Entered Catch for Exception");
}
finally
{
System.out.println("Enterd Finally Block in Main");
}
System.out.println("Thank You");
System.out.println("Reached The End");
}
}