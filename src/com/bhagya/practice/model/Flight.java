package com.bhagya.practice.model;

public class Flight {

    private String FlightName;
    private int FlightNo;
    private int FlightTime;
    private String Destination;
    private String Status;

    @Override
    public String toString() {
        return "Flight{" +
                "FlightName='" + FlightName + '\'' +
                ", FlightNo=" + FlightNo +
                ", FlightTime=" + FlightTime +
                ", Destination='" + Destination + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }

    public String getFlightName() {
        return FlightName;
    }

    public void setFlightName(String flightName) {
        FlightName = flightName;
    }

    public int getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(int flightNo) {
        FlightNo = flightNo;
    }

    public int getFlightTime() {
        return FlightTime;
    }

    public void setFlightTime(int flightTime) {
        FlightTime = flightTime;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
