class Student
{
int rollno,marks;
char grade;

void admission(int x)
{
rollno = x;
}

void exam(int m)
{
marks = m;
}

void getgrade()
{
if(marks>90)
grade = 'A';
else if(marks>80)
grade = 'B';
else if(marks>70)
grade = 'C';	
else
grade = 'D';	
}
void Result()
{
System.out.println(rollno+" -> Roll No. "+marks+" -> Marks "+grade+" -> Grade");
}
}
class School
{
public static void main (String s[])
{
Student s1 = new Student();
s1.admission(1001);
s1.exam(80);
s1.getgrade();
s1.Result();
}
}