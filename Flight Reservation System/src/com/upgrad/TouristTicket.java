package com.upgrad;

public class TouristTicket extends Ticket {
    public String hotelAddress;
    public String selectedTouristLocation[];

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Flight flight, Passenger passenger, float price, boolean cancelled) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, flight, passenger, price, cancelled);
        this.hotelAddress=hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;
    }

    public String getHotelAddress(){
        return hotelAddress;
    }
    public String[] getSelectedTouristLocation(){
       return selectedTouristLocation;
    }
    public void removeTouristLocation(String location){
        int index = -1;
        for (int i=0; i<selectedTouristLocation.length;i++){
            if(selectedTouristLocation[i].equals(location)){
                index=1;
                break;
            }
        }
        if(index == -1) {
            return;
        }
        for (int i = index; i<selectedTouristLocation.length-1;i++){
            selectedTouristLocation[i] = selectedTouristLocation[i+1];
        }
        selectedTouristLocation[selectedTouristLocation.length-1] = null;

    }
    public void addTouristLocation(String location){
        int index = -1;
        for (int i=0; i<selectedTouristLocation.length; i++){
            if(selectedTouristLocation[i] == null){
                index=i;
                break;
            }
        }
        if(index != -1){
            selectedTouristLocation[index] = location;
        }

    }

}
