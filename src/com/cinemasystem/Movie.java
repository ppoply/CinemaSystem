package com.cinemasystem;

import javax.lang.model.type.ArrayType;
import java.sql.Time;
import java.util.ArrayList;

/*
This is the class that contains information regarding a movie/film
 */
public class Movie
{
    private String title;
    private String description;

    private static ArrayList<String> languages;         //To be populated on creation (File I/O)
    private int baseLang;                               //Movie's language
    private ArrayList<Integer> subLangs;                //Languages of subtitles

    private static ArrayList<String> safetyRatings;     //To be populated on creation (File I/O)
    private int safetyRating;                           //Movie's rating

    private static ArrayList<String> genreList;         //To be populated on creation (File I/O)
    private ArrayList<Integer> genres;                  //Movie's genres

    private Date releaseDate;
    private boolean isAvailableIn3D;
    private Time duration;                              //Movie's duration

    //Some constructor , should be parameterized

    public void setSafetyRating() {
        /*
        This function sets the safety rating of the movie based on the list of genres.
        Also , the admin/manager must have input to verify the safety rating , before it is set.
         */
    }

    public  static void populateGenres();                //Using File I/O fill the static arraylists
    public  static void populateLanguages();
    public  static void populateSafetyRatings();

    public abstract void setTimings();                           //Sets a list of timings based on admin
}
