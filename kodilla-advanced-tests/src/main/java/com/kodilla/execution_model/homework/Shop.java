package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrder (LocalDate startDate, LocalDate stopDate) {
        List<Order> Orders2 = new ArrayList<>();
        for (Order order: orders) {
            if (order.getDate().isAfter(startDate) && order.getDate().isBefore(stopDate)) {
                Orders2.add(order);
            }
        }
        return Orders2;
    }


    public int getOrdersSize() {
        return orders.size();
    }

    public List <Order> addOrderIfValueIsCorrect(int min, int max) {

        List<Order> orders3 = new ArrayList<>();
        for (Order order:orders){
        if (order.getValue() >= min && order.getValue() < max) {
            orders3.add(order);
        }
        }
        return orders3;
    }

}

