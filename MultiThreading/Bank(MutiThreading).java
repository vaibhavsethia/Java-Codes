class Bank
{
int bal;
Bank(int b)
{
bal = b;
}
synchronized void wid(int amt)
{
if(bal>amt)
{
System.out.println("Suffiecent balance");
try{
Thread.sleep(2000);
}
catch(InterruptedException e)
{}
bal = bal-amt;
}
else
{
System.out.println("insuffiecent balance");
}
}
void enquiry()
{
System.out.println("Remaining balance "+bal);
}
}
class MYThread extends Thread
{
int amt;
Bank b;
MYThread(Bank b,int am)
{
this.b = b;
amt = am;
start();
}
public void run()
{
b.wid(amt);
b.enquiry();
}
}
class BankTest
{
public static void main(String S[])
{
Bank b = new Bank(10000);
MYThread m1 = new MYThread(b,8000);
MYThread m2 = new MYThread(b,8000);

}
}