package com.mycompany.practicle5;
public class Practicle5 
{

    public static void main(String[] args)
    {
        Circle c1= new Circle(10.0);
        double CircleArea = c1.CalculateArea();
        c1.display();
        System.out.println("Area of the Circle :"+CircleArea);
        
        Rectangle r1= new Rectangle(8.0,5.0);
        double rectangleArea = r1.CalculateArea();
        r1.display();
        System.out.println("Area of the Rectangle :"+rectangleArea);
    }
}
