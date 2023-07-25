package com.mycompany.practical_5;
public class Lecturer implements Speaker
{
    @Override
    public void speak(String phrase)
    {
        System.out.println("Lecturer: "+phrase);
    }
}
