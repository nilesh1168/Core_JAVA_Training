package com.psl.day4.inventory;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	int customerNumber;
	String name;
	long homePhone;
	long cellPhone;
	long workPhone;
	String street;
	String city;
	String state;
	long zip;
	List<PurchaseOrder> pOrders;
	
	public Customer(int id, String name) {
		this.customerNumber = id;
		this.name = name;
		this.pOrders = new ArrayList<PurchaseOrder>();
	}
	
	public void setPrintingAddress(String street,String state,String city,long zip){
		this.street = street;
		this.state = state;
		this.city = city;
		this.zip = zip; 
	}
	
	public void setPhoneNumbers(long homePhone,long cellPhone,long workPhone) {
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}
	
	public void printPhoneNumbers() {
		System.out.println("----------Contact Numbers----------");
		System.out.println("Mobile : "+this.cellPhone);
		System.out.println("Home Phone : "+this.homePhone);
		System.out.println("Work Phone : "+this.workPhone);
	}
	
	public void printShippingAddress() {
		System.out.println("\t\t----------Shipping Address----------");
		System.out.println("\t\t\tStreet : "+this.street);
		System.out.println("\t\t\tCity : "+this.city);
		System.out.println("\t\t\tState : "+this.state);
		System.out.println("\t\t\tZip : "+this.zip);
	}
	
	
	public void addPurchaseOrder(PurchaseOrder order) {
		this.pOrders.add(order);
	}
	
	
	public List<PurchaseOrder> getPurchaseOrders() {
		return pOrders;
	}
	
	
	@Override
	public String toString() {
		return "Id=" + customerNumber + ", Name=" + name + ", Home Phone=" + homePhone + ", CellPhone=" + cellPhone
				+ ", Work Phone=" + workPhone + ", Street=" + street + ", City=" + city + ", State=" + state + ", Zip="
				+ zip + "]";
	}
	
}
