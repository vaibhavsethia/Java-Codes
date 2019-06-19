class Employee
{
String  name;
int id;
float basic;
Employee(int id , String name)
{
this.id=id;
this.name=name;
}
void show()
{
System.out.println(id);
System.out.println(name);
}
}
class PartTimeEmployee extends Employee
{
int noh;
float rate,sal;
void calculate(noh,rate)
{
sal = noh*rate;
}
