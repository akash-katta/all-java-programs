package com.stringhandling;

import java.util.Scanner;

public class ReverseAndPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine(); // Java --> 0 1 2 3
		String rstr = "";
		
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i); // j A V A
			rstr = c + rstr;
		}
		System.out.println("Reverse String of given String is: " + rstr);
		
		if(str.equalsIgnoreCase(rstr)) {
			System.out.println("given String is Palindrome!!");
		}else {
			System.out.println("String is not Palindrome!!");
		}
	}

}
