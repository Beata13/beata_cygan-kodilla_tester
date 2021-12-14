package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(FirstName, principal.FirstName) && Objects.equals(LastName, principal.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName);
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Principal(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    private String FirstName;
   private String LastName;


    @Override
    public String toString() {
        return "Principal{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
