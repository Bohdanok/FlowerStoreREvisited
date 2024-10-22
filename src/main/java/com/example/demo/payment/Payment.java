package com.example.demo.payment;

public interface Payment {
    boolean pay(double price);
    String description();
}