package com.psl.day4.inventory;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Customer cust1 = new Customer(1,"Jamie");
		cust1.setPhoneNumbers(9876543201L,9068964537L, 9883098989L);
		cust1.setPrintingAddress("West", "Los Angeles","USA",567586);

		
		Customer cust2 = new Customer(2,"Bill");
		cust2.setPhoneNumbers(9876234320L,9068657537L, 9386098989L);
		cust2.setPrintingAddress("East", "Las Vegas","USA",675567);
		
		
		Customer cust3 = new Customer(2,"Joe");
		cust3.setPhoneNumbers(9876543201L,9068964537L, 9883098989L);
		cust3.setPrintingAddress("West", "Los Angeles","USA",567586);

		StockItem milk = new StockItem(1,"Milk",20,50);
		StockItem chicken = new StockItem(2,"Chicken",150,10);
		StockItem apple = new StockItem(3,"Apple",8,150);
		StockItem egg = new StockItem(4,"Egg",5,150);
		StockItem orange = new StockItem(5,"Orange",7,140);
		
		PurchaseOrder PO1 = new PurchaseOrder(1,new Date());
		PO1.addItem(new OrderItem(milk,2));
		PO1.addItem(new OrderItem(chicken, 2));
		PO1.addItem(new OrderItem(egg, 12));
		
		PurchaseOrder PO2 = new PurchaseOrder(2,new Date());
		PO2.addItem(new OrderItem(apple,5));
		PO2.addItem(new OrderItem(orange, 10));

		PurchaseOrder PO3 = new PurchaseOrder(3,new Date());
		PO3.addItem(new OrderItem(chicken, 5));
		PO3.addItem(new OrderItem(apple, 10));
	
		cust1.addPurchaseOrder(PO1);
		cust1.addPurchaseOrder(PO2);
		cust2.addPurchaseOrder(PO3);
		
		PO1.setShipDate(new Date());
		PO2.setShipDate(new Date());
		PO3.setShipDate(new Date());
		
		System.out.println("Purchase Order 1 ");
		System.out.println(PO1.isShipped? "Order Shipped !"+PO1.shipDate : "Order not Shipped!");
		for (OrderItem order : PO1.getItems()) {
			
			System.out.println(order.stockItem.itemNumber+", "+ order.stockItem.itemDescription+", "+order.numberOfItems);
		}
		
		System.out.println("Purchase Order 2 ");
		System.out.println(PO2.isShipped? "Order Shipped !"+PO2.shipDate : "Order not Shipped!");
		for (OrderItem order : PO2.getItems()) {
			System.out.println(order.stockItem.itemNumber+", "+ order.stockItem.itemDescription+", "+order.numberOfItems);
		}
		
		System.out.println("Purchase Order 3 ");
		System.out.println(PO3.isShipped? "Order Shipped !"+PO3.shipDate : "Order not Shipped!");
		for (OrderItem order : PO3.getItems()) {
			System.out.println(order.stockItem.itemNumber+", "+ order.stockItem.itemDescription+", "+order.numberOfItems);
		}
		
		System.out.println("Total Sales for "+cust1.name);
		for (PurchaseOrder order : cust1.getPurchaseOrders()) {
			System.out.println("Total sales for order "+order.poNumber);
			System.out.println(order.sumItems());
		}
		
		
		System.out.println("Total Sales for "+cust2.name);
		for (PurchaseOrder order : cust2.getPurchaseOrders()) {
			System.out.println("Total sales for order "+order.poNumber);
			System.out.println(order.sumItems());
		}
		
		System.out.println("Total Sales for "+cust3.name);
		for (PurchaseOrder order : cust3.getPurchaseOrders()) {
			System.out.println("Total sales for order "+order.poNumber);
			System.out.println(order.sumItems());
		}
		
		System.out.println("\t\tInvoices");
		double sum = 0;
		System.out.println("\t\t\t\t"+cust1.name);
		cust1.printShippingAddress();
		System.out.println("\t\t------------------------------------");
		for (PurchaseOrder order : cust1.getPurchaseOrders()) {
			System.out.println("\t\tOrder Number : "+order.poNumber);
			System.out.println("\t\tOrder Date : "+order.orderDate );
			System.out.println("\t\tShipping Date : "+order.shipDate);
			System.out.println("\t\t------------Items------------");
			for (OrderItem item : order.getItems()) {
				System.out.println("\t\t\t"+item.stockItem.itemDescription+"\t"+item.numberOfItems+"\t"+item.stockItem.itemPrice);
			}
			
			sum = sum + order.sumItems();
			
		}
		System.out.println("\n\n\t\t\t\t\tTotal Invoice : "+ sum);
	}

}
