package com.mycompany.arrayexception.obj;
public class ArrayExceptionObj
{

    public static void main(String[] args) 
    {
       int[] numbers={1,2,3,4,5};
       int index = 6;
       
       try
       {
           int value = numbers[index];
           System.out.println("Value at index" +index+" :" +value);
       }
       catch(ArrayIndexOutOfBoundsException e)
               {
                   System.out.println("Error : Invalid Index "+index+ "accessed.");
               }
    }
}
