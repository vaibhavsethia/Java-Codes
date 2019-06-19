import java.io.*;
class Function
{
static void add(int x , int y)      
{ 						     
	int z = x+y;		    
	System.out.println("Sum = "+z);
}
static void subtract(int x , int y)      
{ 						     
	int z = x-y;		    
	System.out.println("Sum = "+z);
}
static int multiply (int x , int y)      
{ 						     
	return(x*y);
}
static int divide (int x , int y)      
{ 						     
	return(x/y);
}
public static void main (String S[])throws IOException
    {    
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    int a,b,i,r;
	System.out.println("What do you want to do :\n ");
	System.out.println("1. Add");
	System.out.println("2. Subtract");
	System.out.println("3. Multiply");
	System.out.println("4. Divide");
	i=Integer.parseInt(BR.readLine());
	switch (i)
	{
	case 1:
	System.out.println("Enter values of a and b");
	a = Integer.parseInt(BR.readLine());
	b = Integer.parseInt(BR.readLine());
	add(a,b);
	break;
	
	case 2:
	System.out.println("Enter values of a and b");
	a = Integer.parseInt(BR.readLine());
	b = Integer.parseInt(BR.readLine());
	subtract(a,b);
	break;
	
	case 3:
	System.out.println("Enter values of a and b");
	a = Integer.parseInt(BR.readLine());
	b = Integer.parseInt(BR.readLine());
	r = multiply(a,b);
	System.out.println("Result is "+r);
	break;
	
	case 4:
	System.out.println("Enter values of a and b");
	a = Integer.parseInt(BR.readLine());
	b = Integer.parseInt(BR.readLine());
	r = divide(a,b);
	System.out.println("Result is "+r);
	break;
	}
  }
}