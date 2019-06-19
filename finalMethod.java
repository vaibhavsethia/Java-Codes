class Test
{
final void m1()
{
System.out.println("m1 im Test");
}
}
class Check extends Test
{
void m1()
{
System.out.println("m1 in Check");
}
}
class Top
{
public static void main(String S[])
{
Test T1 = new Check();
T1.m1();
}
}