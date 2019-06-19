class MathTest
{
static int x;
static
{
x = (int)(Math.random()*10);
System.out.println(x);
}
static
{
System.out.println("Class loaded");
}
{
System.out.println("Object created");
}
static void m1()
{
System.out.println("m1 called");
}
}
class Check1
{
public static void main (String S[])
{
System.out.println("Welcome");
MathTest.m1();
}
static
{
System.out.println("Class Check1 (with main function) Loaded");
}
}