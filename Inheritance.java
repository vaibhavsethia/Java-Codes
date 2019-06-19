class A
{
void m1()
{
System.out.println("m1 in A");
}
}
class B extends A
{
void m2()
{
System.out.println("m2 in B");
}
}
class C extends B
{
void m3()
{
System.out.println("m3 in c");
}
}
class Main
{
public static void main(String S[])
{
C c1 = new C();
c1.m1();
c1.m2();
c1.m3();
}
}