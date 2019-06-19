import java.io.*;
class userinput
{
public static void main (String[]args) throws IOException
{
    System.out.println("Plase type your name below :-");
    BufferedReader stdinBR = new BufferedReader(new InputStreamReader(System.in));
    String name = stdinBR.readLine();
    System.out.println("Your name is "+name);
}
}