class Top
{
private void m1()
{
System.out.println("m1 in top");
}
void m2()
{
m1();
System.out.println("m2 in top");
}
}
class Bottom extends Top
{
void m2()
{
System.out.println("m2 in bottom");
super.m2();
}
void m3()
{
System.out.println("m3 in bottom");
}
}
class Down
{
public static void main (String S[])
{
Bottom b1 = new Bottom();
b1.m2();
b1.m3();
}
}