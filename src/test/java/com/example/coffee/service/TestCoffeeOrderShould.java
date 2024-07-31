package com.example.coffee.service;

import com.example.coffee.model.CoffeeOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCoffeeOrderShould {

    @Test
    public void placeOrderWhenCoffeeOrderIsValid() {
        CoffeeOrderService coffeeOrderService = new CoffeeOrderService();
        CoffeeOrder coffeeOrder = new CoffeeOrder("Large", "Latte", 2);

        String actualResponse = coffeeOrderService.placeOrder(coffeeOrder);
        String expectedResponse = "Order placed: 2 Large Latte(s)";
        assertEquals(actualResponse, expectedResponse);
    }

    @Test
    public void notPlaceOrderWhenCoffeeOrderTypeIsInvalid() {
        CoffeeOrderService coffeeOrderService = new CoffeeOrderService();
        CoffeeOrder coffeeOrder = new CoffeeOrder("Large", "", 2);


        String actualResponse = coffeeOrderService.placeOrder(coffeeOrder);
        String expectedResponse = "Invalid order: Coffee type cannot be empty";
        assertEquals(actualResponse, expectedResponse);
    }

    @Test
    public void notPlaceOrderWhenCoffeeOrderQuantityIsInvalid() {
        CoffeeOrderService coffeeOrderService = new CoffeeOrderService();
        CoffeeOrder coffeeOrder = new CoffeeOrder("Large", "Espresso", 0);


        String actualResponse = coffeeOrderService.placeOrder(coffeeOrder);
        String expectedResponse = "Invalid order: Quantity must be at least 1";
        assertEquals(actualResponse, expectedResponse);
    }

    @Test
    public void notPlaceOrderWhenCoffeeOrderSizeIsInvalid() {
        CoffeeOrderService coffeeOrderService = new CoffeeOrderService();
        CoffeeOrder coffeeOrder = new CoffeeOrder("", "Cappuccino", 2);


        String actualResponse = coffeeOrderService.placeOrder(coffeeOrder);
        String expectedResponse = "Invalid order: Coffee size cannot be empty";
        assertEquals(actualResponse, expectedResponse);
    }

    @Test
    public void notPlaceOrderWhenCoffeeOrderTypeIsNotFound() {
        CoffeeOrderService coffeeOrderService = new CoffeeOrderService();
        CoffeeOrder coffeeOrder = new CoffeeOrder("Medium", "Cold Brew", 5);

        String actualResponse = coffeeOrderService.placeOrder(coffeeOrder);
        String expectedResponse = "Invalid order: Cold Brew is not sold at this restaurant";
        assertEquals(actualResponse, expectedResponse);
    }

}