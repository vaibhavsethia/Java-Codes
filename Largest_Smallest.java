import java.util.*;
import static java.lang.System.*;
class Largest_Smallest
{
    public static void main(String S[])
    {
        out.println("Enter 10 numbers");
        int i,l=0,s=0,n;
        for(i=1;i<=10;i++)
        {
            n = new Scanner(System.in).nextInt();
            if(n>l)
            {
                l=n;
            }
            else
            {
                l=l;
            }
            if(n<s)
            {
                s=n;
            }
            else
            {
                s=s;
            }
        }
        out.println("Largest -> "+l);
        out.println("Smallest -> "+s);
    }
}