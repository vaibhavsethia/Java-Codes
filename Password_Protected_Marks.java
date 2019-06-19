import java.util.*;
class Password_Protected_Marks
{
    public static void main (String []args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please your password below");
        int code = SC.nextInt();
        if (code==007)
        {
            System.out.println("Physics -> 24/25");
            System.out.println("History/Civics -> 23.5/25");
            System.out.println("Biology -> 22.5/25");
            System.out.println("Maths -> 18/25");
            System.out.println("English -> 16.5/25");
        }
        else
        {
            System.out.println("The password you entered is incorrect!");
            System.out.println("Please run the program again!");
        }
    }
}
        