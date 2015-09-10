package com.tw.shopping;

public class Good {

    private String name;
    private double price;

    public Good(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public boolean isFood() {
        if (name.equals("chocolate"))
            return true;
        return false;
    }
}
