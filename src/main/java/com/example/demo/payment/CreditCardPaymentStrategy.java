package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    public boolean pay(double amount) {
        System.out.println("Payed by credit card:" + 
        amount + "dollars(Gang gand)");
        return true;
    }
    public String description() {
        return "Payed by credit card";
    }
}
