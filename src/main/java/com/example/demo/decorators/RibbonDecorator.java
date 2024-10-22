package com.example.demo.decorators;

import com.example.demo.Item;

public class RibbonDecorator extends ItemDecorator<Item<? >> {
    private static final double MAGICFORTY = 40;
    private Item<? > item;


    public double price() {
        return this.item.price() + MAGICFORTY;
    }

    public String getDescription() {
        return this.item.getDescription();
    }
}
