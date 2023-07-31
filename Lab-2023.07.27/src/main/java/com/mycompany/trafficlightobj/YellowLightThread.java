package com.mycompany.trafficlightobj;
public class YellowLightThread extends Thread
{
   public void run()
    {
    while(true)
    {
    try
    {
        Thread.sleep(2000); //2 seconds
    }
    catch(InterruptedException e)
    {
        System.out.println(e.getMessage());
    }
    System.out.println("Yellow Light");
    }
    }
}
