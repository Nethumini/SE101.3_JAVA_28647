package com.mycompany.practical_5;
public class Politician implements Speaker
{
    @Override
    public void speak(String phrase)
    {
        System.out.println("Politician: "+phrase);
    }
}
