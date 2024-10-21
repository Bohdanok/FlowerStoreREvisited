package com.example.demo.payment;

public interface Payment {
    public boolean pay(double price);
    public String description();
}