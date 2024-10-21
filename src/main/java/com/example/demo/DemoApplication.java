package com.example.demo;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.flower.Flower;
import com.example.demo.flower.FlowerColor;
import com.example.demo.flower.FlowerType;
import com.example.demo.payment.CreditCardPaymentStrategy;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @GetMapping("/order")
	// public static List<Order> listFlowers() {
	// 	// return List.of()
	// 	return null;
	// }

	@GetMapping("delivery")
	public String deliverOrder(Order order) {
		return order.getDeliveryStrategy().getDeliveryNotification();
		// order.calculateTotalPrice();
	}
	
	@GetMapping("payment")
	public String payOrder(Order order) {
		return order.getPaymentStrategy().description();
		// order.calculateTotalPrice();
	}

	@GetMapping("/ListOfFlowers")
    public static List<Flower> hello() {
        return List.of(new Flower(FlowerColor.RED, 100, 100, FlowerType.CHAMOMILE));
    }
}
