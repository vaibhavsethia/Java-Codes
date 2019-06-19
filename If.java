import java.io.*;
public class If
{
    public static void main (String []args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your age");
        double age = Double.parseDouble(stdin.readLine());
        if (age<=12)
        {
            System.out.println("You are a child.");
        }
        else
        if ((age>12) && (age<=19))
        {
            System.out.println("You are a teenager.");
        }
        else
        if ((age>19) && (age<=64))
        {
            System.out.println("You are an Adult.");
        }
        else
        if(age>=65)
        {
            System.out.println("You are a Senior Citizen.");
        }
    }
}     