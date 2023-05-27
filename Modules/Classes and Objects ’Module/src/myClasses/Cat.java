/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

/**

 @author GTS
 */
public class Cat extends Animal
{
    private String type = "";

    public Cat()
    {
        System.out.println("A cat object has been created !");
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getLegs()
    {
        return legs;
    }

    public void setLegs(int legs)
    {
        this.legs = legs;
    }
    
    public void makeSound()//Method overriding is also known as runtime polymorphism.
    {
        System.out.println("Mewo Meow");
    }

}
