package com.example.coffee.service;

import com.example.coffee.model.CoffeeOrder;

public class CoffeeOrderService {

    private String name;
    private Integer quantity;

    public CoffeeOrderService(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Integer makeCoffee() {
        System.out.println("Making " + quantity + " " + name + "(s)");
        return 0;
    }

}
