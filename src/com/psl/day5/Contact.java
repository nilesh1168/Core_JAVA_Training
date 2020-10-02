package com.psl.day5;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
	static String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	static Pattern pattern = Pattern.compile(EMAIL_REGEX);
	String firstName;
	String middleName;
	String lastName;
	Date dob;
	char gender ;
	Date anniversary;
	String address;
	String area;
	long pinCode;
	String state;
	String country;
	long telephoneNumber;
	long mobileNumber;
	String email;
	String website;
	
	
	boolean validate() {
		boolean valid = true;
		try {
			if(firstName == null || lastName == null || dob == null || email == null) {
				throw new Exception("Error!! First Name, Last Name, DOB, Email are mandatory.");
			}
			
			Matcher matcher = Contact.pattern.matcher(this.email);
			if(!matcher.find()){

				throw new Exception("Error!! Invalid email. Provide a valid format. Ex : abc123@def.com");
			}
			if(this.telephoneNumber == 0 && this.mobileNumber == 0) {
				throw new Exception("Error!! Any one contact number should be provided!!");
			}
		} catch (Exception e) {
			System.out.println(""+e.getMessage());
			valid = false;
		}
		return valid;
	}


	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ",\n dob="
				+ dob + ", gender=" + gender + ", anniversary=" + anniversary + ",\n address=" + address + ", area="
				+ area + ", pinCode=" + pinCode + ", state=" + state + ", country=" + country + ",\n telephoneNumber="
				+ telephoneNumber + ", mobileNumber=" + mobileNumber + ", email=" + email + ", website=" + website
				+ "]\n";
	}
	
	
	
}
