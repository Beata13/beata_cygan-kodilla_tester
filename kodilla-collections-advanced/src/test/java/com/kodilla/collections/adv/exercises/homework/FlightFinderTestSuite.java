package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
@Test
public void testFindDeparture(){
FlightFinder flightFinder = new FlightFinder();
Flight flight = new Flight("Warszawa", "Sztokholm");
flightFinder.findFlightsFrom("Sztokholm");
assertEquals(flight.departure, "Warszawa");

}
    @Test
    public void testFindArrival(){
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Kanada", "Tokio");
flightFinder.findFlightsTo("Kanada");
        assertEquals(flight.arrival, "Tokio");
    }
}