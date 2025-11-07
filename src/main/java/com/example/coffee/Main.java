package com.example.coffee;


import com.example.coffee.service.CoffeeOrderService;

public class Main {
    public static void main(String[] args) {
        var order = new CoffeeOrderService("Latte", 2);
        order.makeCoffee();
    }
}