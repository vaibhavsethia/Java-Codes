class Cmdtest
{
public static void main(String S[])
{
int sum = 0;
for(int i=0;i<S.length;i++)
{
int a = Integer.parseInt(S[i]);
sum = sum + a;
}
System.out.println("Sum = "+sum);
}
}