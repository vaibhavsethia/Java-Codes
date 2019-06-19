import java.io.*;
public class Multiple_age
{
    public static void main (String []args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your age");
        double age = Double.parseDouble(stdin.readLine());
        if(age<=12)
        {
            System.out.println("You are a child.");
        }
        else if(age>=13)
        {
            System.out.println("You are a teenager.");
        }
        else if(age>=50)
        {
            System.out.println("You are somewhat less than a Senior Citizen.");
        }
        else if(age>=65)
        {
            System.out.println("You are a Senior Citizen.");
        }
    }
}