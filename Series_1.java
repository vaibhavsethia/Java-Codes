import java.util.*;
/*series 1+x+(x*x)+(x*x*x)+.... upto 5 */
public class Series_1
{
    public static void main(String [] args)
    {
        int x,i,res=1;
        Scanner SC = new Scanner (System.in);  
        System.out.println("Enter the value of x");
        x = SC.nextInt();
        for(i=1;i<=5;i++)
        {
            res = res*x;
        }
        System.out.println("Sum of series = "+(1+res+res+res+res+res));
    }
}