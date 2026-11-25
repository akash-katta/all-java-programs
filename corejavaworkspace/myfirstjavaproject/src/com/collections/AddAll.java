package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class AddAll {

	public static void main(String[] args) {

		Collection<String> boys = new ArrayList<>();
		boys.add("a");
		boys.add("b");
		boys.add("c");
		boys.add("d");
		System.out.println(boys);
		
		Collection<String> girls = new ArrayList<>();
		girls.add("e");
		girls.add("f");
		girls.add("g");
		girls.add("h");
		System.out.println(girls);
		
		Collection<String> students = new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);
		System.out.println(students);
		
		students.remove("e");
		
		System.out.println(students.contains("a"));
		System.out.println(students.containsAll(girls));
	}

}
