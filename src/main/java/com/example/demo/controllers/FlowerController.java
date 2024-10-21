package com.example.demo.controllers;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.flower.Flower;
import com.example.demo.flower.FlowerColor;
import com.example.demo.flower.FlowerType;
// import com.example.demo.newObe.FlowerService;

@SpringBootApplication
public class FlowerController {

    // private final FlowerService flowerService;

    // public FlowerController(FlowerService flowerService) {
    //     this.flowerService = flowerService;
    // }

    // @Autowired
    // public FlowerController(FlowerService flowerService) {
    //     this.flowerService = flowerService;
    // }

    @GetMapping
    public List<Flower> hello() {
        return List.of(new Flower(FlowerColor.RED, 100, 100, FlowerType.CHAMOMILE));
    }
}