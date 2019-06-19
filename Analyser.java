import java.io.*;
public class Analyser
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the Reading of current");
        double r = Double.parseDouble(stdin.readLine());
        System.out.println("Please enter starting value of Span");
        double s1 = Double.parseDouble(stdin.readLine());
        System.out.println("Please enter ending value of Span");
        double s2 = Double.parseDouble(stdin.readLine());
        double s3 = s2 - s1;
        double x = ((r-4)*100)/s3;
        System.out.println();
        System.out.println(x);
    }
}
        
    