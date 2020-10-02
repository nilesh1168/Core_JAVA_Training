package com.psl.day4.inventory;

public class StockItem {
	int itemNumber;
	String itemDescription;
	double itemPrice;
	int quantity;
	
	public StockItem() {
	
	}
	

	public StockItem(int itemNumber, String itemDescription, double itemPrice, int quantity) {
		super();
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}


	int getQuantity() {
		return this.quantity;
	}


	@Override
	public String toString() {
		return "StockItem [itemNumber=" + itemNumber + ", itemDescription=" + itemDescription + ", itemPrice="
				+ itemPrice + ", quantity=" + quantity + "]";
	}
}
