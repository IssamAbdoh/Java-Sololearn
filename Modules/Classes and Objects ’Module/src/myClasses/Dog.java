package myClasses;

public class Dog extends Animal
{
    public Dog()
    {
        System.out.println("A dog object has been instantiated !");
        legs=4;
    }
    
    public int getLegs()
    {
        return super.legs;
        /*
            You can access the superclass from the subclass using the super keyword.
            For example, super.var accesses the var member of the superclass.
        */
        //return legs;
    }
    
    public void makeSound()//Method overriding is also known as runtime polymorphism.
    {
        System.out.println("Woof Woof");
    }
}
