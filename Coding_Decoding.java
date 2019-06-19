import java.util.*;
class Coding_Decoding
{
    String c1,decode;
    void coding(String c)
    {
        byte b[] = c.getBytes();
        String c2;
        for(int i=0;i<b.length;i++)
        {
            if(i%2==0)
             b[i] = (byte)(b[i]+3);
            else
             b[i] = (byte)(b[i]-3);
        }
        c2 = new String(b);
        c1 = c2;
        System.out.println("The Code for "+c+" is "+c1);
    }
    void decoding(String code)
    {
        byte b[] = code.getBytes();
        String c3;
        for(int i=0;i<b.length;i++)
        {
        if(i%2==0)
         b[i] = (byte)(b[i]-3);
        else
         b[i] = (byte)(b[i]+3);
        }
        c3 = new String(b);
        System.out.println("Decoded form of "+code+" is "+c3);
    }
    public static void main (String S[])
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = SC.nextLine();
        Coding_Decoding cd = new Coding_Decoding();
        cd.coding(str);
        cd.decoding(cd.c1);
    }
}