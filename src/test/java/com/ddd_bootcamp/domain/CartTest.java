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

        List<Product> actual = cart.getProducts();

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getName());
    }

    @Test
    void shouldAddMultipleProductsToCart() {
        Cart cart = new Cart();
        Product aProduct = new Product("Some test product");
        Product anotherProduct = new Product("Another test product");
        cart.add(aProduct);
        cart.add(anotherProduct);

        List<Product> actual = cart.getProducts();

        assertEquals(2, actual.size());
        assertEquals("Some test product", actual.get(0).getName());
        assertEquals("Another test product", actual.get(1).getName());
    }

    @Test
    void shouldAddSameProductTwiceToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product");

        cart.add(product);
        cart.add(product);

        List<Product> actual = cart.getProducts();

        assertEquals(2, actual.size());
        assertEquals("Some test product", actual.get(0).getName());
        assertSame(actual.get(0), actual.get(1));
    }
}