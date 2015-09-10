package com.tw.shopping;

public class Book extends Good{
    private String name;
    private double price;

    public Book(String name, double price) {
        super(name, price);
        this.name = name;
        this.price = price;
    }

    public boolean isFood() {
        return false;
    }

    public boolean isBook() {
        return true;
    }

    public boolean isMedicine() {
        return false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
