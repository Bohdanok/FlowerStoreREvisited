package com.example.demo.decorators;

import com.example.demo.Item;

public abstract class ItemDecorator<T> extends Item<T>{
    public abstract String getDescription();
}
