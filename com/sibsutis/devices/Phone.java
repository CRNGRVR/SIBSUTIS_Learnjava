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

    public boolean equals(PersonalComputer instance)
    {
        if (this.getId() == instance.getId() && 
            this.getPrice() == instance.getPrice() &&
            this.getIp() == instance.getIp())
        {
            return true;
        }

        return false;
    }

    public int hashCode()
    {
        return this.getId() + this.getPrice() + (this.getIp().hashCode() * 31);
    }
}
