class MethodOverloading
{
void m1(int x)
{
System.out.println("m1 (with int x argunments) called");
}
void m1(char x)
{
System.out.println("m1 (with char x as an argument) called");
}
}
class Check
{
public static void main (String S[])
{
MethodOverloading M2 = new MethodOverloading();
M2.m1(10);
M2.m1('A');
}
}