package com.example.demo.decorators;

import com.example.demo.Item;

public class BasketDecorator extends ItemDecorator {
    private static final double MAGICFOUR = 4;
    private Item<?> item;

    public double price() {
        return this.item.price() + MAGICFOUR;
    }

    public String getDescription() {
        return this.item.getDescription();
    }
}
