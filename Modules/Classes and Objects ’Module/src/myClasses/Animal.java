package myClasses;

import java.util.Objects;

public class Animal
{
    protected int legs=0;
    protected String name = "";

    public Animal()
    {
        System.out.println("An Animal object has been instantiated !");
    }
            
    public void bark()
    {
        System.out.println("Woof Woof");
    }
    public void eat()
    {
        System.out.println("Animal is eating");
    }
    
    public void makeSound()
    {
        System.out.println("I am a cute animal .");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;//اذا كان الاوبجكت مش من نوع ال حيوان
        Animal animal = (Animal) o;
        return legs == animal.legs && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs, name);
    }
}
