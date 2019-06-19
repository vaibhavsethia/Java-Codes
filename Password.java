import java.util.*;
class Password
{
    public static void main (String []args) 
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please type your password below");
        int code = SC.nextInt();
        if (code==007)
        {
            System.out.println("Hello Mr.Jatin! "+"How are you?");
        }
        else
        {
             System.out.println("The password you entered is incorrect");
            }
            
        }
    }
    
