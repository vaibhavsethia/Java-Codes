class Bank
{
String name;
int acno,bal;
void open(int a,String b,int c)
{
acno = a;
name = b;
bal = c;
}
void withdraw(int amt)
{
if(bal>amt)
{
System.out.println("You have sufficient amount");
System.out.println("Thank you for withdrawing your amount");
bal = bal-amt;
}
else
{
System.out.println("Insufficient Balance!");
System.out.println("Your Balance is : "+bal);
System.out.println("You cannot withdraw your amount");
System.out.println("Thank you for your visit");
}
}
void deposite(int amt)
{
bal = bal+amt;
System.out.println("Your Balance is : "+bal);
System.out.println("Thank you!");
}
void enquiry()
{
System.out.println(acno+" "+name+" "+bal);
}
}
class Main
{
public static void main(String S[])
{
Bank B1 = new Bank();
System.out.println("You withdrew Rs.2000");
System.out.println("You Deposited Rs.5000");
B1.open(1001,"Jatin",20000);
B1.withdraw(2000);
B1.deposite(5000);
B1.enquiry();
}
}