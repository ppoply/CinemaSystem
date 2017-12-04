package com.cinemasystem;

public class Date implements Comparable<Date>
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Method to get date in string form. Eg : Date(1,1,1998) -> 1st January 1998
    public String toString()
    {
        String result = "";

        if(day/10 != 1)
        {
            switch (day % 10)
            {
                case 1 : result += day + "st"; break;
                case 2 : result += day + "nd"; break;
                case 3 : result += day + "rd"; break;
                default: result += day + "th"; break;
            }
        }
        else
            result += day + "th";

        switch  (month)
        {
            case 1 : result += " January"; break;
            case 2 : result += " February"; break;
            case 3 : result += " March"; break;
            case 4 : result += " April"; break;
            case 5 : result += " May"; break;
            case 6 : result += " June"; break;
            case 7 : result += " July"; break;
            case 8 : result += " August"; break;
            case 9 : result += " September"; break;
            case 10: result += " October"; break;
            case 11: result += " November"; break;
            case 12: result += " December"; break;
        }

        result += " " + year;

        return result;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {

        return year;
    }

    public int compareTo(Date o)
    {
        if(this.year == o.getYear())
        {
            if(this.month == o.getMonth())
            {
                if(this.day == o.getDay())
                    return 0;
                else if(this.day > o.getDay())
                    return 1;
                else
                    return -1;
            }
            else if(this.month > o.getMonth())
                return 1;
            else
                return -1;
        }
        else if(this.year > o.getYear())
            return 1;
        else
            return -1;
    }
}
