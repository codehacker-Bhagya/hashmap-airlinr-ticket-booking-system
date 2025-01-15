package com.bhagya.practice.service;

import com.bhagya.practice.model.BillingAndCancellation;
import com.bhagya.practice.model.Flight;
import com.bhagya.practice.model.Passenger;
import com.bhagya.practice.model.Ticket;

import java.util.Scanner;

import static com.bhagya.practice.service.PassengerService.scanner;

public class AirlineTicketBookingSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
       do  {

        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");
        System.out.println("1. Passenger Registration");
        System.out.println("2. information About Flight");
        System.out.println("3. book your Ticket here");
        System.out.println("4. Billing And Ticket Cancellation Details");
        System.out.println("5. Diplay Passenger");
        System.out.println("0. Exit ");

        option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1:
                PassengerService passengerService = new PassengerService();
                passengerService.acceptPassenger();
                Passenger passenger = new Passenger();
                passengerService.displayPassenger();
                System.out.println("Passenger Created " + passenger);
               // passengerService.deletePassenger(long MoNo);
                break;
        }
        switch (option) {
            case 2:
                FlightService flightService = new FlightService();
                flightService.FlightInformation();
                Flight flight = new Flight();
                flightService.displayFlight();
                System.out.println("Flight Details" + flight);
                break;
        }
        switch (option) {
            case 3:
                TicketService ticketService = new TicketService();
                ticketService.TicketBooking();
                Ticket ticket = new Ticket();
                ticketService.displayTicket();
                break;
        }
        switch (option) {
            case 4:
                BillingAndCancellationService billingAndCancellationService = new BillingAndCancellationService();
                billingAndCancellationService.BillingService();
                BillingAndCancellation billingAndCancellation = new BillingAndCancellation();
                billingAndCancellationService.displayBilling();
                break;
        }

    }while (option != 0);

}
}
