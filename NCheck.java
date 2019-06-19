class Test
{
int a,b;
void input(int a,int b)
{
this.a=a;
this.b=b;
System.out.println("This : "+this);
}
void display()
{
System.out.println(a+" "+b);
}
}
class Check1
{
public static void main (String S[])
{
Test T1 = new Test();
System.out.println("Object T1 : "+T1);
T1.input(10,20);
T1.display();
}
}