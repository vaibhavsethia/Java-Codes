class Student
{
int rollno;
String name;
Student(int i,String s)
{
rollno = i;
name = s;
}
public String toString()
{
return(rollno+" "+name);
}
}
class Top2
{
public static void main (String S[])
{
Object S1 = new Student(101,"abc");
System.out.println(S1);
System.out.println(S1.toString());
}
}