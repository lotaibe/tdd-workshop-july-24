package com.example.coffee.service;

import com.example.coffee.model.CoffeeOrder;

public class CoffeeOrderService {

    private CoffeeOrder coffeeOrder;

    private final String[] coffeeTypes = new String[]{
            "Espresso", "Latte", "Cappuccino"
    };

    public CoffeeOrderService() {
    }

    public String placeOrder(CoffeeOrder order) {

        if (order.getType().isEmpty() || null == order.getType()) {
            return "Invalid order: Coffee type cannot be empty";
        }
        if (order.getSize().isEmpty() || null == order.getSize()) {
            return "Invalid order: Coffee size cannot be empty";
        }
        if (order.getQuantity() < 1) {
            return "Invalid order: Quantity must be at least 1";
        }

        if (!isValidCoffeeType(order.getType())) {
            return "Invalid order: " + order.getType() + " is not sold at this restaurant";
        }

        return "Order placed: " + order.getQuantity() + " " + order.getSize() + " " + order.getType() + "(s)";
    }

    private boolean isValidCoffeeType(String coffeeType) {
        for (String type : coffeeTypes) {
            if (type.equals(coffeeType)) {
                return true;
            }
        }
        return false;
    }

}
