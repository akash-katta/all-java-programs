package com.stringhandling;

import java.util.Scanner;

public class GetBytes {

	public static void main(String[] args) {

		String s1 = "Akash";

		char[] ch = new char[3];
		s1.getChars(0, 3, ch, 0);
		System.out.println(ch);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.next();
		String rstr = "";

		byte[] strbytes = str.getBytes();

		for (byte b : strbytes) {
			System.out.println((char) b);
			char c = (char) b;
			rstr = c + rstr;
		}

		System.out.println("reverse: " + rstr);

	}

}
