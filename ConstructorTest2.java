class ConstructorTest2
{
public static void main (String S[])
{
new Third(10);
}
}
class Third extends Second
{
Third()
{
System.out.println("Default in Third");
}
Third(int a)
{
this();
System.out.println("Parameterized in Third");
}
}
class Second extends First
{
Second()
{
this(5);
System.out.println("Default in Second");
}
Second(int a)
{				
System.out.println("Parameterized in Second");
}
}
class First
{
First()
{
System.out.println("Default in First");
}
First(int a)
{
System.out.println("Parameterized in First");
}
}
