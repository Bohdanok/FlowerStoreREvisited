package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;

class DeliveryTests {

    @Test
    void testDHLDeliveryStrategy() {
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        String notification = dhl.getDeliveryNotification();
        Assertions.assertEquals("Delivery with DHL", notification);
    }

    @Test
    void testPostDeliveryStrategy() {
        PostDeliveryStrategy post = new PostDeliveryStrategy();
        String notification = post.getDeliveryNotification();
        Assertions.assertEquals("Delivery with simple Post", notification);
    }
}
