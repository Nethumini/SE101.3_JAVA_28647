package com.mycompany.containerobj;
public class ContainerObj 
{

    public static void main(String[] args)
    {
       CylindricalContainer c=new CylindricalContainer(8.75,12.50);
       System.out.println("Volume of the Cylinder is : "+c.volume());
    }
}
