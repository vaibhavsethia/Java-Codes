import java.util.*;
import java.io.*;
public class Math_sqrt
{
    public static void main (String args []) throws IOException
    {
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Please enter the number of which you want the square root.");
        double sqrt = Double.parseDouble(stdin.readLine());
        Math.sqrt(sqrt);
        System.out.println("The square root  of "+sqrt+" is " +Math.sqrt(sqrt));
    }
}
        
        