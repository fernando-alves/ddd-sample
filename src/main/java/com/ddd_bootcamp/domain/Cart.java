package com.ddd_bootcamp.domain;

import java.util.*;

public class Cart {
    private final List<Item> items = new ArrayList<>();
    private final Set<String> removedItems = new HashSet<>() {};
    private final UUID uuid = UUID.randomUUID();

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        return uuid.equals(cart.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

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