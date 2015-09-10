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
        double result = 0.0;
        if (itemsPurchased.size() != 0)
            for (int index = 0; index < itemsPurchased.size(); index++) {
                Good good = itemsPurchased.get(index);
                result += good.getPriceForQuantity(quantity.get(index));
            }
        return result;
    }
}
