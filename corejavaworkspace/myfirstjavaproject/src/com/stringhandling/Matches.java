package com.stringhandling;

public class Matches {

	public static void main(String[] args) {
 
		String phone = "9505599000";
		boolean isValid = phone.matches("[6-9]{1}[0-9]{9}");
		System.out.println(isValid);
		
		String Aadhar = "223456789321";
		boolean isValid1 = Aadhar.matches("[2-9]{1}[0-9]{11}");
		System.out.println(isValid1);
		
		String pan = "ABCDE1234G";
		boolean isValid2 = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		System.out.println(isValid2);
		
	}

}
