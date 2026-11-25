package com.stringhandling;

public class Split {

	public static void main(String[] args) {

		String s1="J2SE";
		String s2="J2SE";
		String s3="Java";
		String s4="Spring";
		String s5="SpringBoot";
		
		String names = String.join("-",s1,s2,s3,s4,s5);
		System.out.println(names);
		String str = "Those who do not khow pain will never understand true pain";

		String[] words = str.split("\\s");
		int count = 0;
		for (String word : words) {
			count++;
			System.out.println(word);
		}
		System.out.println(count);
	}

}
