import java.util.*;
class String_Palindrome
{
    public static void main (String S[])
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter a String");
        String s = SC.nextLine();
        int slen = s.length();
        String rs = "";
        for(int i=slen-1;i>=0;i--)
        {
            rs = rs+s.charAt(i);
        }
        System.out.println("Reverse Of the String '"+s+"' is "+rs);
        if(s.equals(rs))
        {
            System.out.println("The String Is Palindrome");
        }
        else
        {
            System.out.println("The String Is Not A Palindrome");
        }
    }
}