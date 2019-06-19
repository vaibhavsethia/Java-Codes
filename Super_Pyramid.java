
/**
 *class Super_Pyramid
 * 
 * @author (Jatin Soni) 
 * @date created (4/2/14)
 */
public class Super_Pyramid
{
    public static void main (String[]args)
    {
        int a,b;
        for(a=10;a>0;a--)
        {
              System.out.print(a);
              for(b=10;b>=a;b=b-1)
               System.out.print(b);
                System.out.println();
            }
        }
    }
        
       