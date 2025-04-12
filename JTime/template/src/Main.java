class Animal
{
    final void makeSound() {
        System.out.println("Animal is making sound!");
    }
}

class Dog extends Animal
{
    //void makeSound()
    //{
        //System.out.println("Dog is barking!");
    //}
}

public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
