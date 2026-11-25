package com.stringhandling;

public class Demo1 {

	public static void main(String[] args) {

		String s1 = "Java"; // --> 1 object -->String literal -->String Constant Pool
		String s5 = "Java"; // --> 0 objects
		
		String s2 = new String("Akash"); // --> 2 objects --> String new Keyword --> 1-Heap Memory, 2-SCP
		String s6 = new String("Akash"); // --> 1 object only in heap
		
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s6));
		
		String s3 = "VCube" + "Java"; // Concatenation
		
		String s4 = s3; // Re-assiging the object
		
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s2);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s5));

 
	}

}
