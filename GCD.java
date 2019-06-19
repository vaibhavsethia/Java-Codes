import java.util.*;
class GCD
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		int temp = 0;
		if(a>b)
		{	
			for(int i = 0;i<=b;i++)
			{
				if(a%i==0&&b%i==0)
				{
					temp  = i;
				}
			}
		}
		else
		{	
			for(int i = 1;i<=a;i++)
			{
				if(a%i==0&&b%i==0)
				{
					temp  = i;
				}
			}
		}
		System.out.println("The GCD is "+temp);
	}
}