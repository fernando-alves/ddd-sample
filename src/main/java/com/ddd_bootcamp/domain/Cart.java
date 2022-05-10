package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Product product) {
        items.removeIf(item -> item.getProduct().getName().equals(product.getName()));
    }

    public List<Item> getItems() { return items; }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}