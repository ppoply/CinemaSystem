package com.cinemasystem;

public class Seat
{
    protected char row;
    protected int col;
    protected String type;
    protected boolean occupied, vip, regular;


    public Seat(char r, int c)
    {
        row = r;
        col =c;
        occupied = false;
    }

    public String toString()
    {
        return type+"/nRow:"+row+"/nSeat Number:"+col;
    }

    public static void main(String[] args)
    {
        
    }
}

class EconomySeat extends Seat
{
    final protected int price = 35;
    public EconomySeat(char r, int c)
    {
        super(r, c);
        type = "Economy";
        vip = false;
        regular = true;
    }
}

class VIPSeat extends Seat
{
    final protected int price = 55;
    public VIPSeat(char r, int c)
    {
        super(r,c);
        type= "VIP";
        vip = true;
        regular = false;
    }
}

