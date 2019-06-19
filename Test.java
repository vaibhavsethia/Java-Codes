class Test
{
public static void main (String s[])
{
Check c1;
c1=new Check();
System.out.println(c1);
Check c2 = new Check();
c1.a = 100;
c1.b = 200;
c1.c = 1000;
c2.a = 10;
c2.b = 20;
c2.c = 2000;
System.out.println(c1.a);
System.out.println(c1.b);
System.out.println(c2.a);
System.out.println(c2.b);
System.out.println(c1.c);
System.out.println(c2.c);
System.out.println(Check.c);
}
}
class Check
{
int a,b;
static int c;
}