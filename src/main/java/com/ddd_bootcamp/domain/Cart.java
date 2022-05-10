package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> items = new ArrayList<>();

    public void add(Product product) {
        items.add(new Item(product));
    }

    public void add(Product product, int quantity) {
        items.add(new Item(product, quantity));
    }

    public void remove(Product product) {
        items.removeIf(item -> item.product.getName().equals(product.getName()));
    }

    public List<Item> getItems() { return items; }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    public class Item {
        private final Product product;
        private int quantity;

        private Item(Product product) {
            this.product = product;
            this.quantity = 1;
        }

        private Item(Product product, int quantity) {
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
}