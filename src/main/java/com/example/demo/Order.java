package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.Delivery;
import com.example.demo.flower.Flower;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.Payment;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Order{

    private List<Item> items;
    private Delivery deliveryStrategy;
    private Payment paymentStrategy;

    public Order(List<Item> items, Delivery delivery, Payment payment) {
        this.items = items;
        this.deliveryStrategy = delivery;
        this.paymentStrategy = payment;
    }

    // public Order(List<Flower> flowers, Delivery delivery, Payment payment) {
    //     this.items = flowers.stream().map(flower -> (Item) flower).collect(Collectors.toList());
    //     this.deliveryStrategy = delivery;
    //     this.paymentStrategy = payment;
    // }    

    // public Order(List<Flower> of, Delivery delivery, Payment payment) {
    //     //TODO Auto-generated constructor stub
    // }

    public void setItems(List<Item> newItems) {
        items = newItems;
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(item -> item.price()).sum();
    }

    public void processOrder() {
        this.deliveryStrategy = null;
        this.items = null;
        this.paymentStrategy = null;
        System.out.println("The order processed! Wait for your goods my man!");
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).matches(item)) {
                items.remove(i);
                return;
            }
        }
    }

}