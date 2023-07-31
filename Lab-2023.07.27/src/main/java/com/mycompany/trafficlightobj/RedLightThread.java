package com.mycompany.trafficlightobj;
public class RedLightThread extends Thread
{
    public void run()
    {
    while(true)
    {
    try
    {
        Thread.sleep(5000); //5 seconds
    }
    catch(InterruptedException e)
    {
        System.out.println(e.getMessage());
    }
    System.out.println("Red Light");
    }
    }
}
