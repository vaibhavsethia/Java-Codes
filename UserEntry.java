import java.io.*;
class UserEntry
{
public static void main (String[]args)
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name");
try
{
String name =  br.readLine();
System.out.println("Enter your Roll no.");
int rollno = Integer.parseInt(br.readLine());
System.out.println("Enter your marks");
int marks = Integer.parseInt(br.readLine());
System.out.println("--------------------------------------------------------------------------------");
System.out.println("My name is "+name);
System.out.println("My rollno is  "+rollno);
System.out.println("My marks are "+marks);	
}
catch(IOException e)
{
System.out.println(e);
}
}
}