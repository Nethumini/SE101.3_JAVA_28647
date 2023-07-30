package com.mycompany.practicle5;
public class Rectangle extends Shape
{
    private double length;
    private double width;
    
    Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    @Override
    double CalculateArea()
    {
        return length * width ;
    }
}
