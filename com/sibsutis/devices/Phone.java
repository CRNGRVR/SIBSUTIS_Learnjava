package com.sibsutis.devices;

public class Phone extends Devices
{
    public Phone(int id, int price)
    {
        super(id, price, "");
    }

    public Phone(int id, int price, String ip)
    {
        super(id, price, ip);
    }

    @Override public String getDeviceType()
    {
        return "Phone";
    }

    public String print()
    {
        return "";
    }
}
