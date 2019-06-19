import java.io.*;
public class Age
{
    public static void main (String []args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int age;
        System.out.println("Please enter your age below:-");
        age = Integer.parseInt(stdin.readLine());
        boolean flag = age >= 18 ? true:false;
            System.out.println("Your age is "+age);
            if(flag)
            System.out.println("You are eligible for voting.");
            
        else
        System.out.println("You are not eligible for voting.");
    }
}