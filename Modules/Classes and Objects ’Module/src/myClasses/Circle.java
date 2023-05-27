package myClasses;

public class Circle extends Shape
{
    public Circle(int width)
    {
        super.width = width;
    }

    @Override
    public void area()
    {
        System.out.println(Math.PI* super.width*super.width );
    }
}
