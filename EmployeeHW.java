class Employee
{
String name;
int id;
int basic;
void setvalue(int id,String nm,int b)
{
this.id = id;
name = nm;
basic = b;
}
void display()
{
System.out.println("Id -> "+id);
System.out.println("Name -> "+name);
System.out.println("Basic -> "+basic);
}
}
class FullTimeEmployee extends Employee
{
int hra,pf,ta,ma,gs,ns;
void calculate()
{
hra = (int)(basic*0.20);
ta=(int)(basic*0.20);
ma=2000;
gs = basic+hra+ta+ma;
ns = gs-pf;
}
void show()
{
display();
System.out.println(ns);
}
}
class SalaryTest
{
public static void main(String S[])
{
FullTimeEmployee e = new FullTimeEmployee();
e.setvalue(1001,"ABC",20000);
e.calculate();
e.show();
}
}