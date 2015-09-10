package com.tw.shopping;

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
}
