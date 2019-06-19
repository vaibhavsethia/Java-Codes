class MyThread extends Thread implements Runnable
{
public void run()
{
for(int i=0;i<20;i++)
System.out.println(i+" My Thread");

System.out.println("My Thread Completed");
}
}
class MainThread
{
public static void main(String S[])
{
System.out.println("Main Started");
MyThread my  = new MyThread();
Thread th = new Thread(my);
th.start();

for(int i=0;i<20;i++)
System.out.println(i+" Main Thread");

System.out.println("Main Completed");
}
}