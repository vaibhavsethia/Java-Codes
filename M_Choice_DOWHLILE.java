import java.util.*;
public class M_Choice_DOWHLILE
{
     public static void main (String []args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        int a;
        do
        {
            System.out.println("Enter your choice");
            a = SC.nextInt();
            switch (a)
            {
                case 1:
                System.out.println("PLease enter 2 numbers");
                int b = SC.nextInt();
                int c = SC.nextInt();
                int d = b+c;
                System.out.println(d);
                break;
                
                case 2:
                System.out.println("PLease enter 2 numbers");
                b = SC.nextInt();
                c = SC.nextInt();
                d = b-c;
                System.out.println(d);
                break;
                
                case 3:
                System.out.println("PLease enter 2 numbers");
                b = SC.nextInt();
                c = SC.nextInt();
                d = b*c;
                System.out.println(d);
                break;
                
                case 4:
                System.out.println("PLease enter 2 numbers");
                b = SC.nextInt();
                c = SC.nextInt();
                d = b/c;
                System.out.println(d);
                break;
            }
        }while (a<5);
    }
}
        