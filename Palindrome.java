import java.util.*;
public class Palindrome
{
    public static void main(String [] args)
    {
        Scanner SC = new Scanner (System.in);
        System.out.println("Please enter the you want to check that whether it is a Palindrome");
        int input = SC.nextInt();
        int reverse = 0;
        int a = input;
        while(input!=0)
        {
            int rem = input%10;
            reverse = reverse*10+rem;
            input = input/10;
        }
       
        System.out.println("Reverse of the no. u entered is : "+reverse);
        if(a == reverse)
        {
            System.out.println("Congratulations! The number you entered is a Palindrome!");
        }
        else
        {
        System.out.println("The number you entered is not a Palindrome!");
        }
    }
}
    