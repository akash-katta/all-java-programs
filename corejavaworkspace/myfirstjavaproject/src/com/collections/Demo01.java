package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {

	public static void main(String[] args) {
		Collection<Object> o = new ArrayList<>();
		o.add(10);
		o.add(22);
		o.add(23);
		o.add("shyam");
		o.add("ram");
		System.out.println(o);

		Collection<Integer> i = new ArrayList<>();
		i.add(10);
		i.add(22);
		i.add(23);
		System.out.println(i);

		Collection<String> names = new ArrayList<>();
		names.add("shyam");
		names.add("ram");
		System.out.println(names);
	}

}
