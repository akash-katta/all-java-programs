package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class HashCode {

	public static void main(String[] args) {

		Collection<String> s1 = new ArrayList<>();
		s1.add("A");
		s1.add("B");
		System.out.println(s1);
		System.out.println(s1.hashCode());

		
		System.out.println("*********************************");
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(20);
		c1.add(10);
		System.out.println(c1);
		
		Collection<Integer> c2= new ArrayList<>();
		c2.add(10);
		c2.add(20);
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		
		
	}

}
