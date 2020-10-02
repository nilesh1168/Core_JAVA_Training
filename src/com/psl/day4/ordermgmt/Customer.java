package com.psl.day4.ordermgmt;

public class Customer {
	
	int id;
	String name;
	long homePhone;
	long cellPhone;
	long workPhone;
	String street;
	String city;
	String state;
	long zip;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void setPrintingAddress(String street,String state,String city,long zip){
		this.street = street;
		this.state = state;
		this.city = city;
		this.zip = zip; 
	}
	
	void setPhoneNumbers(long homePhone,long cellPhone,long workPhone) {
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}
	
	void printPhoneNumbers() {
		System.out.println("----------Contact Numbers----------");
		System.out.println("Mobile : "+this.cellPhone);
		System.out.println("Home Phone : "+this.homePhone);
		System.out.println("Work Phone : "+this.workPhone);
	}
	
	void printShippingAddress() {
		System.out.println("----------Shipping Address----------");
		System.out.println("Street : "+this.street);
		System.out.println("City : "+this.city);
		System.out.println("State : "+this.state);
		System.out.println("Zip : "+this.zip);
	}

	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + name + ", Home Phone=" + homePhone + ", CellPhone=" + cellPhone
				+ ", Work Phone=" + workPhone + ", Street=" + street + ", City=" + city + ", State=" + state + ", Zip="
				+ zip + "]";
	}
	
}
