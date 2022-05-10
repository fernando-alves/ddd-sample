package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product applePencil = new Product("Apple Pencil");
        Product sonyWirelessHeadphone = new Product("Sony Wireless headphone");
        cart.add(applePencil);
        cart.add(applePencil);
        cart.add(sonyWirelessHeadphone);

        System.out.println("Cart = " + cart);
        List<Cart.Item> items = cart.getItems();

        System.out.println("----------------------------------------");
        System.out.println("products = " + items);
        System.out.println("----------------------------------------");
    }
}
