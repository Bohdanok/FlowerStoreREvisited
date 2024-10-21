package com.example.demo.decorators;

import com.example.demo.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;
    private static final double MAGICTHISTEEN = 13;

    public double price() {
        return this.item.price() + MAGICTHISTEEN;
    }

    public String getDescription() {
        return this.item.getDescription();
    }

}
