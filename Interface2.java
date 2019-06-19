interface I1
{
int a = 100;
}
interface I2
{
public static final int a = 200;
}
class Test implements I1,I2
{
int a = 500;
void m1()
{
System.out.println("m1 in Test");
}
}
class Check
{
public static void main (String S[])
{
I1 T1 = new Test();
System.out.println(T1.a);
System.out.println(T1.toString());
//T1.m1();
}
}