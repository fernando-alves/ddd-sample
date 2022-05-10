package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void shouldAddProductToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product");
        cart.add(product);

        List<Cart.Item> actual = cart.getItems();

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getProduct().getName());
    }

    @Test
    void shouldAddMultipleProductsToCart() {
        Cart cart = new Cart();
        Product aProduct = new Product("Some test product");
        Product anotherProduct = new Product("Another test product");
        cart.add(aProduct);
        cart.add(anotherProduct);

        List<Cart.Item> actual = cart.getItems();

        assertEquals(2, actual.size());
        assertEquals("Some test product", actual.get(0).getProduct().getName());
        assertEquals("Another test product", actual.get(1).getProduct().getName());
    }

    @Test
    void shouldAddItemWithGivenQuantityToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product");

        cart.add(product, 2);

        List<Cart.Item> actual = cart.getItems();

        assertEquals(1, actual.size());
        assertEquals(2, actual.get(0).getQuantity());
        assertSame(product, actual.get(0).getProduct());
    }

    @Test
    void shouldRemoveItemFromTheCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product");

        cart.add(product, 2);
        cart.add(new Product("another product"));

        List<Cart.Item> actual = cart.getItems();

        assertEquals(2, actual.size());

        cart.remove(product);

        assertEquals(1, actual.size());
        assertEquals("another product", actual.get(0).getProduct().getName());
    }
}