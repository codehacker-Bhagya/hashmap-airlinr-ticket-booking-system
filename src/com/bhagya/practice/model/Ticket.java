package com.bhagya.practice.model;

public class Ticket {


    private String seatPreference;
    private String Destination;
    private String AddMeal;
    private double TicketAmount;

    @Override
    public String toString() {
        return "Ticket{" +
                "seatPreference='" + seatPreference + '\'' +
                ", Destination='" + Destination + '\'' +
                ", AddMeal='" + AddMeal + '\'' +
                ", TicketAmount=" + TicketAmount +
                '}';
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getAddMeal() {
        return AddMeal;
    }

    public void setAddMeal(String addMeal) {
        AddMeal = addMeal;
    }

    public double getTicketAmount() {
        return TicketAmount;
    }

    public void setTicketAmount(double ticketAmount) {
        TicketAmount = ticketAmount;
    }
}
