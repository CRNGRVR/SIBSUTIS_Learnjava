package com.sibsutis.devices;

public class PersonalComputer extends Devices
{
    public PersonalComputer(int id, int price)
    {
        super(id, price, "");
    }

    public PersonalComputer(int id, int price, String ip)
    {
        super(id, price, ip);
    }

    @Override public String getDeviceType()
    {
        return "PersonalComputer";
    }

    public String print()
    {
        return "";
    }
}
