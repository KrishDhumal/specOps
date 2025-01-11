package com.zubair.shop;

public class ShoppingCart {
	private Product[] items;
	private double total;
	private int idx;
	
	public ShoppingCart() {
		items = new Product[5];
	}

	public void addItem(Product p) {
		if(idx == items.length)
			System.out.println("Shopping cart is full!!");
		else {
			items[idx] = p;
			total += p.getPrice();
			idx ++;
		}
	}
	
	public void checkout() {
		for(int i=0;i<idx;i++) 
			items[i].print();
		
		System.out.println("Cart Total: " + total);
	}
}
