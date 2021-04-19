package com.upgrad;

public class Flight {
    private String flightNumber;
    private String airline;
    public int capacity, bookedSeats;
    public Flight(String flightNumber,String airline,int capacity,int bookedSeats){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;
    }
    public String getFlightNumber(){
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber){
        this.flightNumber=flightNumber;
    }
    public String getAirline(){
        return airline;
    }
    public void setAirline(String airline){
        this.airline=airline;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public int getBookedSeats(){
        return bookedSeats;
    }
    public void setBookedSeats(int bookedSeats){
        this.bookedSeats=bookedSeats;
    }
    public String getFlightDetails(){
        String str = "Flight No: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked seats: " + bookedSeats;
        return  str;
    }
    public boolean checkAvailability(){
        return bookedSeats < capacity;

    }
    public void incrementBookingCounter(){
        bookedSeats++;
    }



}
