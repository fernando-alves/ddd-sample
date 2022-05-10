package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void shouldAddProductToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product");
        cart.add(new Item(product,1));

        List<Item> actual = cart.getItems();

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getProduct().getName());
    }

    @Test
    void shouldAddMultipleProductsToCart() {
        Cart cart = new Cart();
        Item aItem = new Item(new Product("Some test product"), 1);
        Item anotherItem = new Item(new Product("Another test product"), 1);
        cart.add(aItem);
        cart.add(anotherItem);

        List<Item> actual = cart.getItems();

        assertEquals(2, actual.size());
        assertEquals("Some test product", actual.get(0).getProduct().getName());
        assertEquals("Another test product", actual.get(1).getProduct().getName());
    }

    @Test
    void shouldAddItemWithGivenQuantityToCart() {
        Cart cart = new Cart();
        Item item = new Item(new Product("Some test product"), 2);

        cart.add(item);

        List<Item> actual = cart.getItems();

        assertEquals(1, actual.size());
        assertEquals(2, actual.get(0).getQuantity());
        assertSame(item.getProduct(), actual.get(0).getProduct());
    }

    @Test
    void shouldRemoveItemFromTheCart() {
        Cart cart = new Cart();
        Item item = new Item(new Product("Some test product"), 1);

        Product product = new Product("another product");
        cart.add(item);
        cart.add(new Item(product, 2));

        List<Item> actual = cart.getItems();

        assertEquals(2, actual.size());

        cart.remove(product);

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getProduct().getName());
    }

    @Test
    void shouldKeepListWithRemovedItemsFromTheCart() {
        Cart cart = new Cart();
        Product aProduct = new Product("Some test product");
        Item item = new Item(aProduct, 1);
        cart.add(item);
        cart.remove(aProduct);

        Set<String> removedItems = new HashSet<>();
        removedItems.add("Some test product");
        assertEquals(removedItems, cart.getRemovedItems());
    }
}