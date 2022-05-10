package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Item applePencil = new Item(new Product("Apple Pencil"), 1);
        Item sonyWirelessHeadphone = new Item(new Product("Sony Wireless headphone"), 2);
        cart.add(applePencil);
        cart.add(sonyWirelessHeadphone);

        System.out.println("Cart = " + cart);
        List<Item> items = cart.getItems();

        System.out.println("----------------------------------------");
        System.out.println("products = " + items);
        System.out.println("----------------------------------------");
    }
}
