package com.tw.shopping;

public class Good {

    private String name;
    private double price;

    public Good(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public boolean isFood() {
        if (name.contains("chocolate"))
            return true;
        return false;
    }

    public boolean isBook() {
        if (name.contains("book"))
            return true;
        return false;
    }

    public boolean isMedicine() {
        return false;
    }
}
