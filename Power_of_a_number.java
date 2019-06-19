import java.util.*;
public class Power_of_a_number
{
     public static void main (String []args)
    {
        Scanner SC = new Scanner (System.in);
        System.out.println("Please enter the number");
        int base = SC.nextInt();
        System.out.println("Enter its power");
        int power = SC.nextInt();
        int i,result=1;
        for (i=1;i<=power;i++)
        {
            result =result*base;
            
        }
    System.out.println(result);
    }
}
        