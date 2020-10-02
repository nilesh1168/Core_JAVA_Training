package com.psl.day5;

import java.util.Date;

public class ContactTest {

	public static void main(String[] args) {
		Contact c = new Contact();
		c.email = "n.suryawashi1168@gmail.com";
		c.firstName = "Nilesh";
		c.lastName = "Suryawanshi";
		c.dob = new Date();
		c.mobileNumber = 9049425095L;
		Stack<Contact> stack=new Stack<Contact>(10);
		stack.push(c);
		stack.printStack();
		
		
		Stack<Integer> intStack = new Stack<Integer>(5);
		intStack.push(100);
		intStack.printStack();
	}

}
