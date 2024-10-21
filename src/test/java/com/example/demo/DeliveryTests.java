package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;

class DeliveryTests {

    @Test
    void testDHLDeliveryStrategy() {
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        String notification = dhl.getDeliveryNotification();
        assertEquals("Delivery with DHL", notification);
    }

    @Test
    void testPostDeliveryStrategy() {
        PostDeliveryStrategy post = new PostDeliveryStrategy();
        String notification = post.getDeliveryNotification();
        assertEquals("Delivery with simple Post", notification);
    }
}