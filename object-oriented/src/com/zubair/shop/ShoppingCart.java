package com.zubair.shop;

public class ShoppingCart {
    private Product[] items;
    private int itemCount; // To keep track of how many items are added
    private double total;

    public ShoppingCart() {
        items = new Product[5]; // Fixed size array
        itemCount = 0;
        total = 0.0;
    }

    public void addItem(Product p) throws ShoppingCartException {
        if (itemCount == 5) {
            throw new ShoppingCartException("Shopping cart is full!!");
        } else {
            items[itemCount] = p;
            itemCount++;
            total += p.getPrice();
        }
    }

    public void checkout() {
        for (int i = 0; i < itemCount; i++) {
            items[i].print();
        }
        System.out.println("Cart Total: " + total);
    }
}
