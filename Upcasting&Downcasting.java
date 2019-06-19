class Animal
{
}
class Dog extends Animal
{
}
class Cat extends Animal
{
}
class Forest
{
public static void main (String S[])
{
Animal a = new Dog();//direct upcasting
Dog d = (Dog)a;//downcasting
}
}
