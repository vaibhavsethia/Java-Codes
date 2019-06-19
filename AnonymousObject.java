class Top
{
void m2()
{
System.out.println("m2");
}
}
class Test
{
Top m1()
{
System.out.println("m1");
Top T1 = new Top();
return T1;
}
}
class Check
{
public static void main (String S[])
{
new Test().m1().m2();	// <- Anonymous Object & it can only be used once in the program
}
}