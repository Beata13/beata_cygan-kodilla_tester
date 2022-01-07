package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {


    List<Flight> flightsTable = new ArrayList<>();

    public FlightRepository() {
        this.flightsTable.add(new Flight("Sztokholm", "Warszawa"));
        this.flightsTable.add(new Flight("Berlin", "Moskwa"));
    }
    public int size(){
        return flightsTable.size();

    }



}