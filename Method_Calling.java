import java.util.*;
public class Method_Calling
{ 
    void add (int a, int b)
    {
        int sum = 0;
        sum = a+b;
        System.out.println(sum);
    }
    
    public static void main (String [] args)
     {
         Scanner SC = new Scanner (System.in);
         System.out.println("Please enter the value of A");
         int a = SC.nextInt();
         System.out.println("Please enter the value of B");
         int b = SC.nextInt();
         Method_Calling MC = new Method_Calling();  
         MC.add(a,b);
        }
}
         
    
   
    