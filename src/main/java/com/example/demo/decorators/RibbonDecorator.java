package com.example.demo.decorators;

import com.example.demo.Item;

public class RibbonDecorator extends ItemDecorator{
    private Item item;
    private static final double MAGICFORTY = 40;

    public double price() {
        return this.item.price() + MAGICFORTY;
    }

    public String getDescription() {
        return this.item.getDescription();
    }
}
