package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
@Test
public void testFindDeparture(){
FlightFinder flightFinder = new FlightFinder();

    List<Flight> fligthts = flightFinder.findFlightsFrom("Sztokholm");
    assertEquals(1, fligthts.size());

}
    @Test
    public void testFindArrival(){
        FlightFinder flightFinder = new FlightFinder();
       List<Flight> flights2 = flightFinder.findFlightsTo("Warszawa");
        assertEquals(1, flights2.size());
    }
}