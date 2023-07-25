package com.mycompany.practical_5;
public class Practical_5 
{

    public static void main(String[] args) 
    {
        Speaker speaker1 = new Priest();
        speaker1.speak("Bless You");
        
        Speaker speaker2 = new Politician();
        speaker2.speak("Vote me");
        
        Speaker speaker3 = new Lecturer();
        speaker3.speak("Today we are going to learn Programming.");
    }
}
