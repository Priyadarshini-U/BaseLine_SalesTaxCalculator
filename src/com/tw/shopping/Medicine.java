package com.tw.shopping;

public class Medicine extends Good{
    private String name;
    private double price;

    public Medicine(String name, double price) {
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
