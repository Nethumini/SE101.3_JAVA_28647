package com.mycompany.trafficlightobj;
public class GreenLightThread extends Thread 
{
    public void run()
    {
    while(true)
    {
    try
    {
        Thread.sleep(10000); //10 seconds
    } 
    catch(InterruptedException e)
    {
        System.out.println(e.getMessage());
    }
    System.out.println("Green Light");
    }
    }
}
