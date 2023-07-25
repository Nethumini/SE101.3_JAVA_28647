package com.mycompany.question2;
import java.util.Scanner;
public class Question2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int no1=sc.nextInt();
        
        System.out.println("Enter the first integer: ");
        int no2=sc.nextInt();
        
        System.out.println("Enter the first integer: ");
        int no3=sc.nextInt();
        
        int sum = no1+no2+no3;
        double average=sum/3.0;
        int product=no1*no2*no3;
        int smallest= Math.min(no1,Math.min(no2,no3));
        int largest= Math.max(no1,Math.max(no2,no3));
        
        System.out.println("Sum: "+sum);
        System.out.println("Average :"+average);
        System.out.println("Product :"+product);
        System.out.println("Smallest :"+smallest);
        System.out.println("Largest :"+largest);
        
    }
}
