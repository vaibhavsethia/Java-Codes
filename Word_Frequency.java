import java.util.*;
class Word_Frequency
{
    public static void main(String S[])
    {
        System.out.println("Enter a word\n");
        String str1;
        str1 = new Scanner(System.in).nextLine();
        str1 = str1.toLowerCase();
        StringBuffer str = new StringBuffer(str1);
        char c[] = str1.toCharArray();
        int i=0,j=0;
        int n = c.length;
        int f[] = new int[n];
        for(;i<n;i++)
        {
            if(c[i]==c[j])
            {
                f[i]++;
                str.delete(i,i);
            }
            
            j++;
        }
        System.out.println("Alphabet        Frequency");
        System.out.println(str);
        for(i=0;i<n;i++)
        {
            System.out.println(f[i]);
        }
    }
}