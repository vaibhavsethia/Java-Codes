class Student
{
String name;
int rollno;
Student(int r,String  y)
{
rollno = r;
name = y;
}
void display()
{
System.out.println(rollno+"\t"+name);
}
}
class SchoolTest
{
public static void main (String S[])
{
Student s1[]={new Student(101,"abc"),new Student(102,"mno"),new Student(103,"xyz")};
for(Student st:s1)
{
st.display();
}
}
}