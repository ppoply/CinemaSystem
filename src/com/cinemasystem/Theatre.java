package com.cinemasystem;

import java.sql.Time;
import java.util.ArrayList;

public class Theatre extends Movie
{
    private int rating;
    private ArrayList<Seat> hall;

    private boolean isHouseful;
    private ArrayList<Time> showTimings;

    public double selectSeats();                //Sets selected seats to occupied & calculates total cost

}
