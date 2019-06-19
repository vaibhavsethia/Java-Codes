class ReturnTest
{
public static void main(String S[])
{
Check C1 = new Check();
System.out.println(C1.sum(10,20));
System.out.println(C1.multiply(20,20));
}
}
class Check
{
static int sum(int x , int y)
{
return x+y;
}
static int multiply(int x, int y)
{
return x*y;
}
}
