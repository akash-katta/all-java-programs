package com.stringhandling;

public class Contains {

	public static void main(String[] args) {

		char[] data = {'a','b','c'};
		String s1 = String.copyValueOf(data);
		System.out.println(s1);

		String[] names = {"ram", "sham","rohith", "rahul","vijay"};
		
		for(String name:names) {
			if(!name.contains("h")) {
				System.out.println(name);
			}
		}
		for(String name:names) {
			if(name.toLowerCase().startsWith("r") || name.toLowerCase().endsWith("m")) {
				System.out.println(name);
			}
		}
	}

}
