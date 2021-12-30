package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private FlightRepository flightRepository = new FlightRepository();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flights = new ArrayList<>();
        for (Flight flight : flightRepository.flightsTable) {
            if (flight.departure.equals(departure)) {
                flights.add(flight);
            }
        }
        return flights;
    }

    private FlightRepository flightRepository2 = new FlightRepository();

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flights2 = new ArrayList<>();
        for (Flight flight : flightRepository.flightsTable) {
            if (flight.arrival.equals(arrival)) {
                flights2.add(flight);
            }

        }
        return flights2;
    }
}