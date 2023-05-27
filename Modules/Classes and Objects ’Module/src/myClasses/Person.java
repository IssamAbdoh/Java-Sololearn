package myClasses;

public abstract class Person
{
    private String name;
    private int age;
    
    public Person (String n) 
    {
        this.name = n;
    }

    public Person ()
    {
        name="";
        age=0;
    }

    abstract void speak();
}
