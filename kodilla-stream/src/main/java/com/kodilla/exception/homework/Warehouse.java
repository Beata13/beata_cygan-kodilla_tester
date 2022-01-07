package com.kodilla.exception.homework;

import java.util.*;
import java.util.stream.Stream;

public class Warehouse {
    static List<String> orders = new LinkedList<>();

    public  void addOrder(String orders) {

    }

    public static void  getOrder(String number) throws OrderDoesntExistException {
        orders.stream();
        Stream<String> stringStream = orders.stream().filter(u -> orders.size(1));
        orders.stream().map(n -> orders.add("Pizza"));
       orders.forEach(System.out::println);
    if (orders.isEmpty())
    throw new OrderDoesntExistException();
    }
    }

