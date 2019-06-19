class MOverloading
{
void m1(int x,char y)
{
System.out.println("m1 (with int x and char y argunments) called");
}
void m1(char y,int x)
{
System.out.println("m1 (with char x and int y as an argument) called");
}
}
class Check
{
public static void main (String S[])
{
MOverloading M2 = new MOverloading();
M2.m1(10,'A');
M2.m1('A',10);
}
}