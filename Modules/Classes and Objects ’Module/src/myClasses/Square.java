package myClasses;

public class Square extends Shape
{
    public Square(int width)
    {
        super.width = width;
    }

    @Override
    public void area()
    {
        System.out.println(super.width*super.width);
    }
}
