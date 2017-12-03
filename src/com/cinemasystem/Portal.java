package com.cinemasystem;

import java.util.ArrayList;

public class Portal
{
    private ArrayList<Theatre> theatres;

    public void login();                    // Either a customer or an admin


    public void addTheatre();
    public void removeTheatre();
    public void sortTheatres(int parameter);
    public void showTheatres();

    public void purchaseTicket();           // Multithreading to be implemented
}
