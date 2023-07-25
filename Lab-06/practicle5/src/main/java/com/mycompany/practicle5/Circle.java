package com.mycompany.practicle5;
public class Circle extends Shape
{
    private double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    double CalculateArea()
    {
        return Math.PI * radius * radius;
    }
}
