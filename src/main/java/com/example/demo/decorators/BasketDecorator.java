package com.example.demo.decorators;

import com.example.demo.Item;

public class BasketDecorator<T> extends ItemDecorator<T> {
    private static final double MAGICFOUR = 4;
    private Item<T> item;

    public double price() {
        return this.item.price() + MAGICFOUR;
    }

    public String getDescription() {
        return this.item.getDescription();
    }
}
