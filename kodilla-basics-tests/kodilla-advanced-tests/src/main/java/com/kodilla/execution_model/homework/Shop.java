package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    Order order = new Order();

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrder (LocalDate dateIsBefore, LocalDate dateIsAfter) {
               if (order.getDate().isAfter(dateIsAfter) && order.getDate().isBefore(dateIsBefore)) {
            return getOrder(dateIsBefore, dateIsAfter);
        }
        return null;
    }

    public Order getOrders(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }

    public int getOrdersSize() {
        return orders.size();
    }

    public boolean getOrdersValue() {
        return orders.add(order);
    }

    public String addOrderIfValueIsCorrect() {
        int value = 0;
        if (value >= 10 && value < 1000) {
            addOrder(new Order());
        }
        return "Value is not correct";
    }

}

