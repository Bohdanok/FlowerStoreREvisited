package com.example.demo.decorators;

import com.example.demo.Item;

public class BasketDecorator extends ItemDecorator{
    private Item item;
    private static final double MAGICFOUR = 4;

    public double price() {
        return this.item.price() + MAGICFOUR;
    }

    public String getDescription() {
        return this.item.getDescription();
    }
}
