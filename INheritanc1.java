class abc
{
int a = 100;
int b;
void m1()
{
System.out.println("m1 in abc");
}
void m2(int x)
{
b = x+100;
m1();
System.out.println("m2 in abc");
}
}
class xyz extends abc
{
int c;
void m1(int y)
{
c = y;
m2(y+100);
System.out.println("m1 in xyz");
}
void show()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class Test
{
public static void main (String S[])
{
Bottom b1 = new Bottom();
b1.m2();
b1.m3();
}
}