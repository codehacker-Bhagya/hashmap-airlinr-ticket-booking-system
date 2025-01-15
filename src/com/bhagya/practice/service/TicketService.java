package com.bhagya.practice.service;

import com.bhagya.practice.model.Ticket;

import java.util.*;

public class TicketService {

    private Map<Integer , Ticket> tickets = new HashMap<>();

    int ticketIndex = 0;

  private static  Scanner scanner = new Scanner(System.in);


    public static void ticketData(Ticket ticket){
        System.out.println(ticket);

    }

    Ticket TicketBooking(){
        int option =0;

        Ticket ticketbooking = new Ticket();
        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Your Seat Preference");
        String Preference = scanner.nextLine();
        System.out.println("Enter Your Destionation");
        String Destination = scanner.nextLine();
        System.out.println("Do you Wnat Add meal");
        String meal = scanner.nextLine();
        System.out.println("Your Total Amount");
        System.out.println("Your Ticket Amount Is : 5000Rs." + "Meal Charge = 1000rs"  + "CGST = 400rs"  + "Total amount is:6400rs");


        ticketbooking.setSeatPreference(Preference);
        ticketbooking.setDestination(Destination);
        ticketbooking.setAddMeal(meal);
        return ticketbooking;

    }

    public void displayTicket() {
        Set<Map.Entry<Integer, Ticket>> entrySet = tickets.entrySet();
        for (Map.Entry<Integer, Ticket> ticketEntry : entrySet) {
            System.out.println("Key: " + ticketEntry.getKey() + "| Value " + ticketEntry.getValue());
        }

    }


}
