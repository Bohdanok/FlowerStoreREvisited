package com.example.demo.flowerMy.delivery;

import java.util.List;

public class PostDeliveryStrategy extends Delivery {
    @Override
    public void deliver(List<FlowerPack> items) {
        System.out.println("Post delivery");
    }
}
