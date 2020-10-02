package com.psl.day4.inventory;

public class OrderItem {
	
	StockItem stockItem;
	int numberOfItems;
	
	public OrderItem() {		
	}
	
	
	
	
	public OrderItem(StockItem stockItem, int numberOfItems) {
		super();
		this.stockItem = stockItem;
		this.numberOfItems = numberOfItems;
	}


	double getTotal() {
		return 0.0;
	}




	@Override
	public String toString() {
		return "OrderItem [stockItem=" + stockItem + ", numberOfItems=" + numberOfItems + "]";
	}
}
