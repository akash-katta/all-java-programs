package com.stringhandling;

public class IndexOF {

	public static void main(String[] args) {
		  String s1 = "java is always simple in Vcube at JNTU";

	        System.out.println(s1.indexOf('a',  s1.indexOf('a', s1.indexOf('a',s1.indexOf('a') + 1) + 1) + 1));
	        System.out.println(s1.indexOf('a'));
	        System.out.println(s1.lastIndexOf('a'));
	}

}
