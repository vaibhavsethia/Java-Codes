class InvalidMarksException extends Exception
{
public String toString()
{
return "marks between 10 to 100";
}
}
class Student
{
int marks;
void setMarks(int m) throws InvalidMarksException
{
if(m<0||m>100)
{
throw new InvalidMarksException();
}
else
{
marks = m;
}
}
void result()
{
System.out.println("Marks = "+marks);
}
}
class School
{
public static void main(String S[])
{
Student S1 = new Student();
try
{
S1.setMarks(120);
S1.result();
}
catch(InvalidMarksException e)
{
}
}
}