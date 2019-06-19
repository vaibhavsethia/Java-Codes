import java.util.*;
import static java.lang.System.*;
class PerfectNumber
{
    public static void main(String ...S)
    {
        out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();
        int i,sum = 0;
        for(i=1;i<=num-1;i++)
        {
            if(num%i==0)
            {
                out.println(i);
                sum = sum+i;
            }
        }
        if(sum==num)
        {
            out.println("Perfect Number");
        }
        else
        {
            out.println("Not A Perfect Number !");
        }
    }
}