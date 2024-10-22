package com.example.demo.decorators;

import com.example.demo.Item;

public class RibbonDecorator<T> extends ItemDecorator<Item<T>> {
    private static final double MAGICFORTY = 40;
    private Item<T> item;


    public double price() {
        return this.item.price() + MAGICFORTY;
    }

    public String getDescription() {
        return this.item.getDescription();
    }
}
