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

    public void addToBasket(Good good) {
        itemsPurchased.add(good);
    }
}