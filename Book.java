import java.io.*;
class Book
{
String bname;
int status=0,bid;
void open(String a,int b)
{
bname = a;
bid = b;
}
void issue()
{
if(status==1)
{
System.out.println("Book is already issued");
}
if(status==0)
{
System.out.println("You can issue the book");
status=1;
}
}
void status(int s)
{
if(status == 1)
{
System.out.println("Book is now issued");
}
if(status == 0)
{
System.out.println("You can issue the book.");
}
}
void submit(int sub)
{
if(status==0)
{
System.out.println("Thank you for submitting!");
status = 1;
}
else
{
System.out.println("You cannot submit the book!");
}
}
void enquiry()
{
System.out.println(bname+" "+bid);
}
}
class Library
{
public static void main(String S[]) throws IOException
{
Book B1 = new Book();
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
System.out.println("How many books you want to issue");
int n = Integer.parseInt(stdin.readLine());
int w = 1;
while(w<=n)
{
System.out.println("Enter Book name");
String bookname = stdin.readLine();
System.out.println("Enter Book Id");
int bookid = Integer.parseInt(stdin.readLine());
System.out.println("What do you want to do :-");
System.out.println("1. Issue");
System.out.println("2. Submit");
int iss = Integer.parseInt(stdin.readLine());
B1.open(bookname,bookid);
int ss = B1.status;
switch(iss)
{
case 1:
B1.issue();
B1.status(ss);
break;
case 2:
B1.submit(ss);
B1.status(ss);
break;
default:
System.out.println("Please enter a valid choice");
break;
}
w++;
}
B1.enquiry();
}
}