package com.example.demo.flowerMy.delivery;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery<MyClass> {
    @Override
    public void deliver(List<FlowerPack> items) {
        System.out.println("DHL delivery");
    }
}
