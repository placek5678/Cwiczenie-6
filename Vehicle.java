package com.company;

public class Vehicle
{
    private String Engiene;
    private String Color;
    private String Size;
    public String Model;

    public Vehicle(String Engiene, String Color, String Size)
    {
        this.Engiene = Engiene;
        this.Color = Color;
        this.Size = Size;
        String Model = "Pojazd posiada slinik: " + Engiene + " ma kolor " + Color + " a nadwozie to " + Size + ".";
        System.out.println(Model);
    }
}