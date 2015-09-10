package com.tw.shopping;

public class Food extends Good{
    private String name;
    private double price;

    public Food(String name, double price) {
        super(name, price);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double salesTax() {
        return 0;
    }
}
