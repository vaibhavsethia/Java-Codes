class A
{
A()
{
System.out.println("Constructor in A");
}
}
class B extends A
{
B()
{
System.out.println("Default Constructor in B");
}
B(int a)
{
this();
System.out.println("Paramterized Constructor in B");
}
}
class C extends B
{
C(int b)
{
super(10);
System.out.println("Default Constructor in C");
}
}
class D
{
public static void main(String S[])
{
new C(20);
}
}