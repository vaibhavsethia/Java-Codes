class Book
{
String bname;
Book(String nm) //constructor of class Book
{
bname = nm;
}
void display()
{
System.out.println("Book name : "+bname);
}
}
class Student
{
String name;
int rollno;
Book b;
Student(int r , String nm)
{
b = new Book("Java");
rollno = r;
name = nm;
}
void show()
{
System.out.println(rollno+"  "+name);
b.display();
}
}
class School
{
public static void main (String S[])
{
Student S1 = new Student(101,"abc");
S1.show();
}
}