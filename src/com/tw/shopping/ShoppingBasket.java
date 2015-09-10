package com.tw.shopping;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    List<Good> itemsPurchased;
    List<Integer> quantity;

    public ShoppingBasket() {
        itemsPurchased = new ArrayList<Good>();
        quantity = new ArrayList<Integer>();
    }

    public int getNumberOfGoods() {
        return itemsPurchased.size();
    }

    public void addToBasket(Good good, int quantity) {
        itemsPurchased.add(good);
        this.quantity.add(quantity);
    }

    public double sumOfPrice() {
        if (itemsPurchased.size() == 0)
            return 0.0;
        return itemsPurchased.get(0).getPrice() * quantity.get(0);
    }
}
