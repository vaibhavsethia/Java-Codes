/*Class to find 10 random numbers between 0 and 100*/
class MathTest
{
public static void main (String S[])
{
int x;
for(int i=1;i<=10;i++)
{
x = (int)(Math.random()*100);
System.out.println(x);
}
}
}