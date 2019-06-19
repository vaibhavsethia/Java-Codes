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