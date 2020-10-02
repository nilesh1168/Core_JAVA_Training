package com.psl.day4.inventory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrder {
	int poNumber;
	Date orderDate;
	Date shipDate;
	boolean isShipped;
	List<OrderItem> items;
	
	public PurchaseOrder(int poNo,Date orderDate) {
		create(poNo, orderDate);
	}
	
	void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	boolean isShipped() {
		return this.isShipped;
	}
	
	double sumItems() {
		double sum = 0;
		for (OrderItem orderItem : items) {
			sum = sum + orderItem.numberOfItems*orderItem.stockItem.itemPrice;
		}
		return sum;
	}
	
	void setShipDate(Date date)
	{
		this.shipDate = date;
		this.isShipped = true;
	}
	
	void create(int poNo, Date orderDate) {
		this.poNumber = poNo;
		this.orderDate = orderDate;
		this.items = new ArrayList<OrderItem>();
		this.isShipped = false;
	}
	
	 List<OrderItem> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [poNumber=" + poNumber + ", orderDate=" + orderDate + ", shipDate=" + shipDate
				+ ", items=" + items + "]";
	}
}
