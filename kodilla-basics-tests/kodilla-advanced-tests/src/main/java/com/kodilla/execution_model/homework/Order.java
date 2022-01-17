package com.kodilla.execution_model.homework;

public class Order {
    private double value;
    private double date;
    private String login;

    public Order(double value, double date, String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public Order() {

    }

    public double isValue() {
        return value;
    }

    public double getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }
}
