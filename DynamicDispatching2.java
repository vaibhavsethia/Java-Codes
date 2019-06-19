class Animal
{
public void run()
{
System.out.println("Run in animal");
}
public void eat()
{
System.out.println("Eat in animal");
}

}
class Dog extends Animal
{
public void eat()
{
System.out.println("Eat in dog");
}
public void breathe()
{
System.out.println("breathe in dog");
}
}
class Cat extends Animal
{
public void run()
{
System.out.println("Run in Cat");
}
public void sleep()
{
System.out.println("Sleep in Cat");
}
}
class Forest
{
static void discovery(Animal a)
{
a.run();
a.eat();
//a.sleep();
//a.breathe();
}
public static void main(String S[])
{
discovery(new Dog());
discovery(new Cat());
}
}