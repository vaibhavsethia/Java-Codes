import java.util.*;
public class Bijli_ka_bill
{
    public static void main (String [] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Bijli ki rates :-");
        System.out.println("First 100 units -> Rs.1/unit");
        System.out.println("Next 100 units -> Rs.2/unit");
        System.out.println("Next 100 units -> Rs.4/unit");
        System.out.println("Next 100 units -> Rs.7/unit");
        System.out.println("Next 100 units -> Rs.10/unit");
        System.out.println("Above 500 units -> Rs.12/unit");
        System.out.println("Enter your meter's reading");
        int units = SC.nextInt();
        int cost = 100*1+(units-100)*2;
        System.out.println("Your billing amount is Rs."+cost);
    }
}