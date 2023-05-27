/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes.and.objects.module;

//import myClasses.*;

import myClasses.*;


/*
import static java.lang.Math.max;
import static java.lang.Math.sqrt;
*/
import java.util.Scanner;

import static java.lang.Math.*;


public class ClassesAndObjectsModule
{
    public static final double PI=22.0/7;
    /*
    Use the final keyword to mark a variable constant, 
    so that it can be assigned only once.
    
    Methods and classes can also be marked final. 
    This serves to restrict methods so that they can't be 
    overridden and classes so that they can't be subclassed.
    */
    
    
    static void sayHello(String name) 
    {
        System.out.println("Hello " + name);
    }

    static int sum(int val1, int val2) 
    {
        return val1 + val2;
    }

    public static void main(String[] args)
    {
        System.out.println(Converter.toBinary(42));
        
        sayHello("David");
        sayHello("Amy");
        
        {
            int x = sum(2, 5);
            System.out.println(x);
        }
        
        {
            System.out.println(sumOfMany(1,6,12,13,16,32,101));
        }
        
        {
            Animal dog = new Animal();
            dog.bark();
        }
        
        {
            Vehicle v1 = new Vehicle();
            //v1.color= "Red"; A private member that cannot be accessed outside the class
            v1.setColor("Red");
            
            Vehicle v2 = new Vehicle();
            v2.horn();
        }

        {
            /*
            public is an access modifier, meaning that it is used to set the level of access. You can use access modifiers for classes, attributes, and methods.

            For classes, the available modifiers are public or default (left blank), as described below:
            public: The class is accessible by any other class.
            default: The class is accessible only by classes in the same package.

            The following choices are available for attributes and methods:
            default: A variable or method declared with no access control modifier is available to any other class in the same package.
            public: Accessible from any other class.
            protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass (Subclasses and superclasses are covered in upcoming lessons).
            private: Accessible only within the declared class itself.
            */
        }
        
        {
            System.out.println(sqrt(16));
            
            Vehicle v = new Vehicle();
            v.setColor("Buluda");
            System.out.println(v.getColor());
        }
        
        {
            /**
                By the  way , you can overload any method you want , even the main method!
                but if you want the overloaded main method to work , then you have to call it
                unlike the main main method , which is called automatically .
            */
        }
        
        {
            Vehicle v = new Vehicle();
            System.out.println(v.getColor());
        }
        
        {
            Person j;
            //j = new Person("John");
            //j.setAge(20);
            //celebrateBirthday(j);
            //System.out.println(j.getAge());
            //When you create an object using the constructor, you create a reference variable.
            //Because j is a reference type, the method affects the object itself, and is able to change the actual value of its attribute.
        }
        
        {
            System.out.println(max(1,15));
        }
        
        {
            Vehicle b15= new Vehicle();
            System.out.println("COUNT" + Vehicle.COUNT);
            System.out.println("COUNT" + b15.COUNT);

            //myClasses.Vehicle.horn();
            Vehicle.horn();//static method
            
            /*
                Another example of static methods are those of the Math class, which is why you can call them without creating a Math object.
                Also, the main method must always be static.
            */
        }
        
        {
            Dog d=new Dog();
            System.out.println("The dog has " + d.getLegs() + " legs !");
        }
        
        {
            Animal c1 = new Cat();
            Cat c2 = new Cat();

            Animal d1 = new Dog();
            
            c1.makeSound();
            c2.makeSound();
            d1.makeSound();
            
            String s="koko OLA OLA";
            s = s.toLowerCase().toUpperCase();//CHAINING
            System.out.println(s);
        }
        
        {
            System.out.println(Vehicle.COUNT);
            Vehicle v1 = new Vehicle(100,4,"yellow",1000.25);
            System.out.println(Vehicle.COUNT);
            System.out.println(v1.toString());
        }
        
        {
            Scientist s=new Scientist();
            s.setLoser("KOKO");
            Scientist s2 = new Scientist(s);
            System.out.println(s2.getLoser());
            
            s.setLoser("SHOSHO");
            System.out.println(s2.getLoser());
        }

        {
            Cat2 c = new Cat2();
            c.eat();
        }

        {
            /*
            * Java supports automatic type casting of integers to floating points, since there is no loss of precision.
On the other hand, type casting is mandatory when assigning floating point values to integer variables.
            * */
        }

        {
            /*
            For classes, there are two types of casting.
            Upcasting
            You can cast an instance of a subclass to its superclass.
            Consider the following example, assuming that Cat is a subclass of Animal.
            */
            Animal a = new Cat();
            //Java automatically upcasted the Cat type variable to the Animal type.

            /*
            Downcasting

            Casting an object of a superclass to its subclass is called downcasting.
             */
            Animal a2 = new Cat();
            ((Cat)a2).makeSound();
            /*
            Why is upcasting automatic, downcasting manual?
            Well, upcasting can never fail. But if you have a group of different Animals and want to downcast them all to a Cat,
            then there's a chance that some of these Animals are actually Dogs, so the process fails.
            */
        }

        {
            Machine m1 = new Machine()
            {
                @Override public void start()
                {
                    System.out.println("Wooooo");
                }
            };
            /*//@Override is optional
            The @Override annotation is used to make your code easier to understand,
            because it makes it more obvious when methods are overridden.
            */
            m1.start();
            Machine m2 = new Machine();
            m2.start();
        }

        {
            Robot r = new Robot(1);
        }

        {
            //when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.
            /* //this code is valid and the output is false
            class A {
                private int x;
                public static void main(String[ ] args) {
                    A a = new A();
                    a.x = 5;
                    A b = new A();
                    b.x = 5;
                    System.out.println(a == b);
                }
            }
             */

            Animal a1 = new Animal();
            a1.setName("koko");
            a1.setLegs(5);
            Animal a2 = new Animal();
            a2.setName("koko");
            a2.setLegs(5);

            System.out.println(a1.equals(a2));

        }

        {
            //An Enum is a special type used to define collections of constants.
            //Basically, Enums define variables that represent members of a fixed set.
            /*
            You should always use Enums when a variable (especially a method parameter) can
            only take one out of a small set of possible values.
            If you use Enums instead of integers (or String codes),
            you increase compile-time checking and avoid errors from passing in invalid constants,
            and you document which values are legal to use.
            Some sample Enum uses include month names, days of the week, deck of cards, etc.
            */
            Rank a = Rank.SOLDIER;

            switch(a) {
                case SOLDIER:
                    System.out.println("Soldier says hi!");
                    break;
                case SERGEANT:
                    System.out.println("Sergeant says Hello!");
                    break;
                case CAPTAIN:
                    System.out.println("Captain says Welcome!");
                    break;
            }

        }

        {
            Scanner sc = new Scanner(System.in);
            //int x = sc.nextInt();
            //int y = sc.nextInt();
            int x = 5;
            int y = 2;

            Square a = new Square(x);
            Circle b = new Circle(y);
            a.area();
            b.area();
        }
    }
    
    static int sumOfMany(int...n)
    {
        int s=0;
        for(int i:n)
        {
            s+=i;
        }
        return s;
    }
    
    static void celebrateBirthday(Person p) 
    {
        //p.setAge(p.getAge() + 1);
    }

    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }

}

class Converter
{
    static public String toBinary(int num)
    {
        String binary="";
        while(num > 0)
        {
            binary = (num%2)+binary;
            num /= 2;
        }
        return binary;
    }
}

class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

//Unlike a class, an inner class can be private. Once you declare an inner class private, it cannot be accessed from an object outside the class.
//The inner class can access all of the member variables and methods of its outer class, but it cannot be accessed from any outside class.

class Robot {
    int id;
    Robot(int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }

    private class Brain {//inner class
        public void think() {
            System.out.println(id + " is thinking");
        }
    }
}
