import java.io.*;
class parse_double
{
    public static void main (String []args) throws IOException
    { 
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
     double age;
     System.out.println("Enter your age");
     age = Double.parseDouble(stdin.readLine());
     System.out.println("Your age is "+age);
    }
}
     