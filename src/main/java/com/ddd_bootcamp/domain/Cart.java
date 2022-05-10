package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items = new ArrayList<>();

    public void add(Product product) {
        items.add(new Item(product));
    }

    public List<Product> getProducts() {
        return items.stream().map(i -> i.product).toList();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    private class Item {
        final Product product;

        private Item(Product product) {
            this.product = product;
        }
    }
}