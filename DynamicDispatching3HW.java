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
void m1()
{
System.out.println("m1 in bottom");
}
void m3()
{
System.out.println("m3 in bottom ");
}
}
class Middle extends Top
{
void m2()
{
System.out.println("m2 in Middle");
}
void m4()
{
System.out.println("m4 in Middle ");
}
}
class Four
{
void m5(Top T)
{
T.m1();
T.m2();
//T.m3();
//T.m4();
}
}
class Down
{
public static void main (String S[])
{
Middle M = new Middle();
Bottom B = new Bottom();
Four F = new Four();
F.m5(M);
F.m5(B);
}
}