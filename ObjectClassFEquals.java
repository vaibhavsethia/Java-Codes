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
public boolean equals(Object ob)
{
Student S3 = (Student)ob;
return(rollno==S3.rollno);
}
}
class Top3
{
public static void main (String S[])
{
Student S1 = new Student(101,"abc");
Student S2 = new Student(101,"abc");
System.out.println(S1.equals(S2));
}
}
