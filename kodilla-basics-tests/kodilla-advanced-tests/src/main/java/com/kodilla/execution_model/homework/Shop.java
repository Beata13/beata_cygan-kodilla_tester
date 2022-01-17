package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    Order order = new Order();

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrder(double date) {
        if (date >= 01.01 && date < 31.01) {
            return orders;
        }
        return null;
    }
    public Order getOrders(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }
    public int getOrdersSize (){
        return orders.size();
    }
    public boolean getOrdersValue(){
        return orders.add(order);
    }
}