import java.util.*;
class Single_Character_Input  
{
    public static void main (String S[])
    {
        char c;
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter a character");
        c = SC.next().charAt(0);
        System.out.println(c);
        if(c>=48&&c<=57)
        {
            System.out.println("Numeric");
        }
        else if(c>=65&&c<=90)
        {
            System.out.println("UPPERCASE ALPHABET");
        }
        else if(c>=97&&c<=122)
        {
            System.out.println("lowercase alphabet");
        }
    }
}