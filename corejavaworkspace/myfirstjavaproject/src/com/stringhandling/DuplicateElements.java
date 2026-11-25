package com.stringhandling;

public class DuplicateElements {

	public static void main(String[] args) {

		String str = "Java";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (str.indexOf(ch) != str.lastIndexOf(ch) && str.indexOf(ch) == i) {

				System.out.println(ch);
			}
		}

	}

}
