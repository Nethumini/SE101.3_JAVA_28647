package com.mycompany.trafficlightobj;
public class TrafficLightobj
{

    public static void main(String[] args)
    {
        RedLightThread R = new RedLightThread();
        R.start();
        
        GreenLightThread G = new GreenLightThread();
        G.start();
        
        YellowLightThread Y = new YellowLightThread();
        Y.start();
    }
}
