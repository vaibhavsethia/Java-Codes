import java.util.*;
public class Minutes_to_Hours
{
    public static void main (String []args)
    {
        Scanner SC = new Scanner (System.in);
        System.out.println("Please enter the time in minutes");
        int s = SC.nextInt();
        int h = s/60;
        int m = s%60;
        System.out.print("Hours \t" + "Minutes \n");
        System.out.println(h+"          "+m);
    }
}
        