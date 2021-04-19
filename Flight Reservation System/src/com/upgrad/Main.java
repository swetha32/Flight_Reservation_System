package com.upgrad;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Address address = new Address();
        System.out.println(address.city);
        System.out.println(address.state);
        System.out.println(address.street);
        Passenger passenger = new Passenger();
        System.out.println(passenger.id);
        System.out.println(passenger.address);
        System.out.println(passenger.contact);
        Contact contact = new Contact();
        System.out.println(contact.name);
        System.out.println(contact.email);
        System.out.println(contact.phone);
        Flight flight = new Flight();
        System.out.println(flight.bookedSeats);
        System.out.println(flight.capacity);
        Ticket ticket = new Ticket();
        System.out.println(ticket.arrivalDateTime);
        System.out.println(ticket.seatNo);
        System.out.println(ticket.price);
        System.out.println(ticket.cancelled);
        System.out.println(ticket.from);
        System.out.println(ticket.departureDateTime);
        System.out.println(ticket.to);
        System.out.println(ticket.pnr);
        System.out.println(ticket.flight);
        System.out.println(ticket.passenger);
        RegularTicket regularTicket = new RegularTicket();
        System.out.println(regularTicket.specialServices);
        TouristTicket touristTicket = new TouristTicket();
        System.out.println(touristTicket.hotelAddress);


    }
}
