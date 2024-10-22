package com.example.demo.decorators;

import com.example.demo.Item;

public class PaperDecorator<T> extends ItemDecorator<Item<T>> {
    private static final double MAGICTHISTEEN = 13;
    private Item<T> item;

    public double price() {
        return this.item.price() + MAGICTHISTEEN;
    }

    public String getDescription() {
        return this.item.getDescription();
    }

}
