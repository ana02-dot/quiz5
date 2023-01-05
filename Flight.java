package com.example.java_ana_chkhutiashvili;

public class Flight {
    private  int price;
    private int Price;
    private int Seats;
    private String Destination;
    private int Time;

    public Flight(int Price, int Seats, String Destination, int Time){
        Price = Price;
        Seats = Seats;
        Destination = Destination;
        Time = Time;

    }

    public int getPrice(){
        return price;
    }

    public int getSeats() {
        return Seats;
    }

    public String getDestination() {
        return Destination;
    }

    public int getTime() {
        return Time;
    }
}
