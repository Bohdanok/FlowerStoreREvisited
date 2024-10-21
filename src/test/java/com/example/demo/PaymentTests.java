package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPallPaymentStrategy;

class PaymentTests {

    @Test
    void testCreditCardPaymentStrategy() {
        CreditCardPaymentStrategy creditCard = new CreditCardPaymentStrategy();
        boolean paymentProcessed = creditCard.pay(100);
        assertTrue(paymentProcessed);
    }

    @Test
    void testPayPallPaymentStrategy() {
        PayPallPaymentStrategy payPall = new PayPallPaymentStrategy();
        payPall.pay(100);
        String description = payPall.description();
        assertEquals("Payed using Pay Pall", description);
    }

    // Add more tests for other payment strategies if needed
}