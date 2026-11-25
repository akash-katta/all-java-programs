package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Iterator {

	public static void main(String[] args) {

		Collection<String> names = new ArrayList<>();
		
		names.add("rahul");
		names.add("Rahul");
		names.add("Akash");
		names.add("Priya");
		names.add("Ravi");
		names.add("Sneha");
		names.add("Kiran");
		Iterator<String> itr = names.iterator();
		System.out.println(names);
	}

}
