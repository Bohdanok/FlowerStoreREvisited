package com.example.demo;

import lombok.Getter;

@Getter
public abstract class Item <T>{
    private double price;
    private String description;

    // public boolean matches(Item item);

    public boolean matches(Item item){
        return this.price == item.price && this.description == item.description;
    }

    public abstract double price();
        // return this.price;

    public String getDescription() {
        return this.description + "and costs: " + this.price;
    }

}
