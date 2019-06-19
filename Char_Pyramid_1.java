public class Char_Pyramid_1
{
    public static void main( String [] args)
    {
        char a;
        char b;
        for(a='A';a<='Z';a++)
        {
            for(b='A';b<=a;b++)
            {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}