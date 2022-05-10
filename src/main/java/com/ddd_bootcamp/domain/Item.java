package com.ddd_bootcamp.domain;

public class Item {
    private final Product product;
    private int quantity;

     public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}
