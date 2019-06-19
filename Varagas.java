class Check
{
void m1(int ...a)
{
int sum = 0;
for(int x:a)
{
sum=sum+x;
}
System.out.println("Sum = "+sum);
}
}
class Test
{
public static void main (String S[])
{
Check c1 = new Check();
c1.m1(10);
c1.m1(10,20);
c1.m1(10,20,30);
}
}