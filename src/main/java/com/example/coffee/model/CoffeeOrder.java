package com.example.coffee.model;

public class CoffeeOrder {
    private String size;
    private String type;
    private int quantity;

    public CoffeeOrder(String size, String type, int quantity) {
        this.quantity = quantity;
        this.type = type;
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
