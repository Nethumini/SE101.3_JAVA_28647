package com.mycompany.finddivision.obj;
import java.util.Scanner;
public class FindDivisionObj 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in); 
        
        System.out.println("Enter First Number :");
        int n1=sc.nextInt();
        
        System.out.println("Enter Second Number :");
        int n2=sc.nextInt();
        
        try
        {
            int result = Divide(n1,n2);
            System.out.println("Result is :"+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : Division by zero is not allowed.");
        }
    }
    public static int Divide(int n1, int n2)
    {
        return n1/n2;
    }
}
