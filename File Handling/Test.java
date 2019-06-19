import java.io.*;
class Student
{
int rollno;
String name;
Student(int r,String nm)
{
rollno = r;
name = n;
}
void display()
{
System.out.println("Rollno "+r);
System.out.println("Name "+n);
}
}
class Check
{
public static void main(String S[])
{
BufferedReader stdinBR = new BufferedReader(new InputStreamReader(System.in));
FileOutputStream fout = new FileOutputStream(fout);
ObjectOutputStream oos = new ObjectOutputStream(fout);
int choice = 1;
while(choice==1)
{
int rollno = Integer.parseInt(br.readLine());
String name = br.readLine();
Student s1 = new Student(rollno,name);
oos.writeObject(s1);
System.out.println("Do you wish to continue");
choice = Integer.parseInt(br.readLine());