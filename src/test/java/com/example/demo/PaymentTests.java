package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPallPaymentStrategy;

class PaymentTests {

    public static final int AHUNDRED = 100;

    @Test
    void testCreditCardPaymentStrategy() {
        CreditCardPaymentStrategy creditCard = new CreditCardPaymentStrategy();
        boolean paymentProcessed = creditCard.pay(AHUNDRED);
        Assertions.assertTrue(paymentProcessed);
    }

    @Test
    void testPayPallPaymentStrategy() {
        PayPallPaymentStrategy payPall = new PayPallPaymentStrategy();
        payPall.pay(AHUNDRED);
        String description = payPall.description();
        Assertions.assertEquals("Payed using Pay Pall", description);
    }
}
