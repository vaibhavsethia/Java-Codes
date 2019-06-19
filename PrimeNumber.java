import java.util.*;
class PrimeNumber
{
static int i,b,n;
int primecheck(int a)
{
for(i=2;i<a;i++)
{
if(n%i==0)
{
b = 1;
break;
}
}
return b;
}    
public static void main(String [] args)
{
Scanner SC = new Scanner(System.in);
System.out.println("Enter a Number");
int a = SC.nextInt();
PrimeNumbers PN = new PrimeNumbers();
PN.primecheck(a);
if(b==1)
{
System.out.println("The number you entered is not prime");
}
else
{
System.out.println("The number you entered is prime");
}
}
}
        