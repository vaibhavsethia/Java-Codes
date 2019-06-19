abstract class Test
{
abstract void m1(); 
}
class Check extends Test
{
void m1()
{
System.out.println("m1");
}
}
class AbstractTest
{
public static void main(String S[])
{
Check C1 = new Check();
C1.m1();
//C1.m2();
}
}