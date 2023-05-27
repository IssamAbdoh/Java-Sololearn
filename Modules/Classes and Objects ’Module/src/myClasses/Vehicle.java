package myClasses;

public class Vehicle
{
    //No modifier in Java is the same as protected.
    int maxSpeed,wheels;
    String color;
    double fuelCapaciy;
    
    public static int COUNT=0;
    //It’s a common practice to use upper case when naming a static variable, although not mandatory.
    
    public Vehicle()
    {
        fuelCapaciy = maxSpeed = wheels =  0;
        color = "none";
        System.out.println("Constructor Number 1");
        COUNT++;
    }
    
    /*
    Vehicle(int s =0,int w=0,double f=0,String c = "none")
    {
        fuelCapaciy = maxSpeed = wheels =  0;
        color = "none";
        COUNT++;
    }
    */

    Vehicle(int maxSpeed,int wheels,String color)//OVERLOADING THE CONSTRUCTOR
    {
        //this constuctor is seen upon the package , ( no access modifier selected , DEFAULT )
        //Another name for method overloading is compile-time polymorphism.
        this ();//you can call the No-Agrs constructor from here like this
        this.maxSpeed=maxSpeed;
        this.wheels=wheels;
        this.color=color;
        System.out.println("Constructor Number 2");
    }
    
    public Vehicle(int maxSpeed,int wheels,String color,double fuelCapaciy)
    {
        this (maxSpeed,wheels,color);//you can use the above constructor as a shorcut , so we don't have to rewrite all the assignment statements again
        this.fuelCapaciy=fuelCapaciy;
        System.out.println("Constructor Number 3");
    }

    static public void horn()//Because it is a static method , it can be called without creating an object of type vehicle
    {
        System.out.println("Beep !");
    }
    
    public String getColor()
    {
        return this.color;
    }

    public void setColor(String c)
    {
        this.color = c;
    }

    //@Override
    public String toString()
    {
        return "Vehicle{" + "maxSpeed=" + maxSpeed + ", wheels=" + wheels + ", color=" + color + ", fuelCapaciy=" + fuelCapaciy + '}';
    }
}
