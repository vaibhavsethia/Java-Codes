public class Leap_Year
{
    public static void main (String[]args)
    {
        int i;
        for (i=1899;i<=2040;i++)
        {
           if(i%4==0)
           System.out.println("Leap Year "+i);
        }
        System.out.println();
    }
}