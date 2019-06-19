class Top
{
void m1()
{
System.out.println("m1 in top ");
}
void m2()
{
System.out.println("m2 in top ");
}
}
class Bottom extends Top
{
void m2()
{
System.out.println("m2 in bottom");
}
void m3()
{
System.out.println("m3 in bottom ");
}
}
class Down
{
public static void main (String S[])
{
Top T = new Bottom();
T.m1();
T.m2();
//T.m3();
}
}