package com.example.demo.newObe;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.flower.Flower;
import com.example.demo.flower.FlowerColor;
import com.example.demo.flower.FlowerType;

@Service
public class FlowerService {
    public List<Flower> gerFlowers() {
        return List.of(new Flower(FlowerColor.BLUE ,100, 100, FlowerType.CHAMOMILE));
    }
}
