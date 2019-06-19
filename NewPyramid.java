import java.util.*;
public class NewPyramid
{
    public static void main(String ...S)
    {
        Scanner SC = new Scanner (System.in);
        int n = SC.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}