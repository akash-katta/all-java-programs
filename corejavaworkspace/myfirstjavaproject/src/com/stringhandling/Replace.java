package com.stringhandling;

public class Replace {

	public static void main(String[] args) {
	     String str = "    Java is simple at vcube is in 500090    ";

	        str = str.trim();
	        // Removes leading and trailing spaces
	        System.out.println(str);

	        str = str.replace('a', 'A');
	        System.out.println(str);

	        str = str.replace("is", "ESSSS");
	        System.out.println(str);

	        str = str.replaceAll("\\s", "");
	        System.out.println(str);

	        str = str.replaceAll("\\d", "X");
	        System.out.println(str);
	        
	        String str1 ="Srikanth";
//	        Returns a String that is a substring of this String
	        System.out.println(str1.substring(3));
	        System.out.println(str1.substring(4,6));
	}

}
