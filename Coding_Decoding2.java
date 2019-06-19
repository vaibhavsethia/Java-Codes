import java.util.*;
class Coding_Decoding2
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
        System.out.println("The Code is "+c1+"\n\n");
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
        System.out.println("The Decoded form is "+c3+"\n\n");
    }
    public static void main (String S[])
    {
        Scanner SC = new Scanner(System.in);
        Coding_Decoding2 cd2 = new Coding_Decoding2();
        System.out.println("What do you want to do :");
        do
        {
        System.out.println("1. Coding\n2. Decoding\n3. Exit");
        int choice = SC.nextInt();
        switch(choice)
        {
            case 1:
                    System.out.println("Enter a String");
                    String str1;
                    str1 = SC.next();
                    cd2.coding(str1);
                    break;
            
            case 2:
                    System.out.println("Enter the Code");
                    String str2;
                    str2 = SC.next();
                    cd2.decoding(str2);
                    break;
                    
            case 3:
                    System.exit(0);
                    break;
        }
        }while(true);
}
}