package com.mycompany.practical_5;
public class Priest implements Speaker
{
    @Override
    public void speak(String phrase)
    {
        System.out.println("Priest: "+phrase);
    }
}
