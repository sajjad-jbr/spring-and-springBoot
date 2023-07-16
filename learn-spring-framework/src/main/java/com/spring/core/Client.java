package com.spring.core;

public class Client {

    public static void main(String[] args) {
        Vehicle vehicle = new Cycle();
        Traveler travel = new Traveler(vehicle);
        travel.startJourney();
    }

}
