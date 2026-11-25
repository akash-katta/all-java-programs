package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class IsEmpty {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		
		c1.add(56);
		if(c1.isEmpty()) {
			c1.add(34);
			c1.add(34);
			c1.add(34);
			c1.add(34);
		}
		System.out.println(c1);
	}

}
