package com.upgrad;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Ticket regularTicket = new RegularTicket("43211","Hyderabad", "Bengaluru", "DepartureDateTime","ArrivalDateTime","13F",null,null,6000,false);
       Ticket touristTicket = new TouristTicket("12345", "chennai", "goa", "DepartureDateTime","ArrivalDateTime","13A",null,null,5000,false);
       printTicketDetails(regularTicket);
       printTicketDetails(touristTicket);

    }
    public static  void printTicketDetails(Ticket ticket) {
        System.out.println((ticket.getPnr()));
    }
}
