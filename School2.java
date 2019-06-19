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
rollno = r;
name = nm;
}
void display()
{
System.out.println(rollno+"  "+name);
b.display();
}
Book get(String nm)
{
b = new Book(nm);
return b;
}
}
class School
{
public static void main (String S[])
{
Student S1 = new Student(101,"abc");
Book b1 = S1.get("Oracle");
S1.display();
S1.b.display();
}
}