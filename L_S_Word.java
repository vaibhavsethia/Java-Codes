import java.util.*;
class L_S_Word
{
    public static void main(String S[])
    {
        String str,max="",min="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :- \n");
        str = sc.nextLine();
        String s1[] = new String[str.length()+1];
        s1 = str.split(" ");
        max = s1[0];
        min = s1[0];
        int n = s1.length;
        try
        {
        for(int i=0;i<n;i++)
        {            
            if(max.length()>s1[i].length())
            max = max;
            else
            max = s1[i];
            
            if(min.length()<s1[i].length())
            min = min;
            else
            min = s1[i];
        }
        }catch(Exception e){}
        System.out.println("MAX = "+max+" = "+max.length());
        System.out.println("min = "+min+" = "+min.length());
    }
}
        