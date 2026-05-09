package com.jspiders.Restaurants;

public class CartItem {
    private String name;
    private int price;
    private int qty;

    public CartItem(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
    	return name; 
    }
    public int getPrice() { 
    	return price; 
    }
    public int getQty() { 
    	return qty; 
    }

    public void setQty(int qty) { 
    	this.qty = qty; 
    }

    public int getTotal() {
        return price * qty;
    }
}
