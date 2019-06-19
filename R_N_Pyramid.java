public class R_N_Pyramid
{
    public static void main (String[]args)
    {
        int a,b;
        for (a=10;a>=0;a--)
        {
            for(b=10;b>=a;b--)
            System.out.print(a+"");
            System.out.println();
        }
    }
}