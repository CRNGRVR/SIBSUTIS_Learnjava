package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Devices implements Printable
{
    private int id;
    private int price;
    private String ip;

    public Devices(int id, int price, String ip) 
    {

    }

    public int getId()
    {
        return 0;
    }

    public int getPrice()
    {
        return 0;
    }

    public String getIp()
    {
        return "";
    }

    public String getDeviceType()
    {
        return "";
    }
}
