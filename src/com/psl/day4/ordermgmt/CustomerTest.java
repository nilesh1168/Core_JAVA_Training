package com.psl.day4.ordermgmt;

public class CustomerTest {

	public static void main(String[] args) {
	
		Customer cust1 = new Customer(1,"Nilesh");
		cust1.setPhoneNumbers(9049425095L,95003293405L, 9888098989L);
		cust1.setPrintingAddress("Anjaninagar", "Maharashtra","Pune",411046);
		cust1.printPhoneNumbers();
		cust1.printShippingAddress();
		System.out.println(cust1.toString());
		
		Customer cust2 = new Customer(2,"John");
		cust2.setPhoneNumbers(9876543201L,9068964537L, 9883098989L);
		cust2.setPrintingAddress("West", "Los Angeles","USA",567586);
		cust2.printPhoneNumbers();
		cust2.printShippingAddress();
		System.out.println(cust2.toString());
		
		Customer cust3 = new Customer(3,"Jane");
		cust3.setPhoneNumbers(9876234320L,9068657537L, 9386098989L);
		cust3.setPrintingAddress("East", "Las Vegas","USA",675567);
		cust3.printPhoneNumbers();
		cust3.printShippingAddress();
		System.out.println(cust3.toString());
	}

}
