package com.cinemasystem;

public abstract class Seat
{
    protected char row;
    protected int col;
    protected boolean occupied;

    public String toString()
    {
        return "" + row + col;
    }

    public abstract double getPrice();
}

class EconomySeat extends Seat
{
    public double getPrice()
    {
        /*
        Reads from a file , to get the value of economy seat price
         */
        return 8;
    }
}
class VIPSeat extends Seat
{
    public double getPrice()
    {
        /*
        Reads from a file , to get the value of VIP seat price
         */
        return 10;
    }
}

