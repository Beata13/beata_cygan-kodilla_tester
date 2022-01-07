package com.kodilla.exception.homework;

import java.util.*;
import java.util.stream.Stream;

public class Warehouse {
    private List<Order> orders = new LinkedList<>();

    public  void addOrder(Order order) {
orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
return orders.stream()
        .filter(o -> o.getNumber().equals(number))
        .findFirst().orElseThrow(()-> new OrderDoesntExistException());

    }
    }

