import java.io.*;
public class method_call
{
    public void area_circle(float radius)
    {
        double area = 0;
        area = 3.14*radius*radius;
        System.out.println("The area of circle is "+area);
       
    }
    public static void main (String args []) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        method_call CR = new method_call();
        System.out.println("Please enter the radius of the circle");
        float input = Integer.parseInt(stdin.readLine());
        CR.area_circle(input);
    }
}