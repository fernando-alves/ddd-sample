package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cart {
    private final List<Item> items = new ArrayList<>();
    private final Set<String> removedItems = new HashSet<>() {};

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Product product) {
        if (items.removeIf(item -> item.getProduct().getName().equals(product.getName()))) {
            removedItems.add(product.getName());
        }
    }

    public List<Item> getItems() { return items; }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    public Set<String> getRemovedItems() {
        return removedItems;
    }
}