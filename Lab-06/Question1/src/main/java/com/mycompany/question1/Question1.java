package com.mycompany.question1;
public class Question1 
{

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the first number :");
        int no1=sc.nextInt();
        
        System.out.println("Enter the second number :");
        int no2=sc.nextInt();
        
        System.out.println("Enter the third number :");
        int no3=sc.nextInt();
        
        int product = no1*no2*no3;
        
        System.out.println("The product of the three integers is: "+product);
        sc.display();
    }
}
