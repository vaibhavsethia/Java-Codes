import java.util.*;
import static java.lang.System.*;
class P_N_Count
{
    public static void main(String ...S)
    {
        out.println("Enter numbers 1 by 1");
        int psum=0,nsum=0,n;
        do
        {
            n = new Scanner(System.in).nextInt();
            if(n>0)
            {
                psum=psum+n;
            }
            if(n<0)
            {
                nsum=nsum+n;
            }
        }while(n!=0);
        out.println("Sum of +ve terms -> "+psum);
        out.println("Sum of -ve terms -> "+nsum);
    }
}