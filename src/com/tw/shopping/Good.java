package com.tw.shopping;

public class Good {

    private String name;
    private double price;

    public Good(String name, double price) {
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
        return price / 10;
    }

    public double importTax() {
        if (name.contains("imported"))
            return price / 20.0;
        return 0.0;
    }

    public double getPriceForQuantity(int quantity) {
        return quantity * price;
    }

    public double getTotalPriceForQuantity(int quantity) {
        if (quantity == 0)
            return 0.0;
        return getPriceForQuantity(quantity) + quantity * (importTax() + salesTax());
    }
}
