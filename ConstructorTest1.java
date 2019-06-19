class ConstructorTest1
{
int a,b;
ConstructorTest1()
{
}
ConstructorTest1(int x,int y)
{
a=x;
b=y;
}
void show()
{
System.out.println(a+" "+b);
}
}
class Check
{
public static void main (String S[])
{
ConstructorTest1 CT = new ConstructorTest1(100,200);
CT.show();
ConstructorTest1 CT1;
CT1 = new ConstructorTest1();
}
}