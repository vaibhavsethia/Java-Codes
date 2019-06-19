public class PrimeNumbers
{
static int i,b,n;
static boolean res;
int primecheck(int a)
{
for(i=2;i<a;i++)
{
if(n%i==0)
{
b = 1;
break;
}
if(b==1)
{
res = true;
}
else
{
res = false;
}
}
return b;
}    
public static void main(String S[])
{
int n = Integer.parseInt(S[0]);
PrimeNumbers PN = new PrimeNumbers();
PN.primecheck(n);
if(res==true)
{
System.out.println("The number you entered is prime");
}
else
{
System.out.println("The number you entered is not prime");
}
}
}
        