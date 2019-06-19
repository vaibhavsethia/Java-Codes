class Top
{
void m1()
{
System.out.println("Hello m1");
}
}
class Bottom
{
public static void main(String s[])
{
Object obj = new Top();
System.out.println(obj);
System.out.println(obj.toString());
Top T = new Top();
T.m1();
System.out.println(T.toString());
}
}