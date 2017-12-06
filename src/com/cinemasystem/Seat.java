package com.cinemasystem;

public abstract class Seat
{
    protected char row;
    protected int col;
    protected boolean occupied;


    public Seat(char r, int c)
    {
        row = r;
        col = c;
        occupied = false;
    }

    public String toString()
    {
        return "Seat: "+row + col;
    }

    public abstract double getPrice()
}

class EconomySeat extends Seat
{
    public EconomySeat(char r, int c)
    {
        super(r, c);
    }

    public double getPrice()
    {
        return 35;                  //Should be handled by file
    }
}

class VIPSeat extends Seat
{
    public VIPSeat(char r, int c)
    {
        super(r,c);
    }

    public double getPrice()
    {
        return 55;                  //Should be handled by file
    }
}

