import java.io.*;
class Bank
{
int acno,bal,amt;
String name;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
void wid() throws IOException
{
System.out.println("Enter the amt");
amt = Integer.parseInt(br.readLine());
if(bal>amt)
{
bal=bal-amt;
}
}
void getDetail() throws IOException
{
System.out.println("Enter account number");
acno=Integer.parseInt(br.readLine());
System.out.println("Enter name");
name=br.readLine();
System.out.println("Enter Balance");
bal=Integer.parseInt(br.readLine());
}
void enquiry()
{
System.out.println("Account Number : "+acno);
System.out.println("Name : "+name);
System.out.println("Balance : "+bal);
}
}
class BankMain
{
public static void main(String S[]) throws IOException
{
Bank b[] = new Bank[30];
int i,n;
for(i=0;i<3;i++)
{
b[i]=new Bank();
b[i].getDetail();
}
for(i=0;i<3;i++)
{
b[i].enquiry();
}
}
}