import java.io.*;
import java.util.*;
public class Factorial
{
    public static void main (String [] args) throws IOException
    {
        Scanner Sc = new Scanner (System.in);
        System.out.println("Please enter a Number from 1 to 5");
       int num = Sc.nextInt();
       int i,a = 1,b,c,n;  
       for(i=1;i<=num;++i)
        {
            a=a*i;
        }
                System.out.println("Factorial : "+a);
    }
}
            