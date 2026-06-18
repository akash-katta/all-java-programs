package com.javaintroduction;

public class Product {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}

	void welcome() {
		Product p1 = new Product();
		System.out.println(p1);
        System.out.println("Welcome");
	}
	void vcube() {
		System.out.println("welcome to vcube");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1 = null; //1) nullifying
		p3= p2; //2) re-assigning
		p3.welcome(); //3) out of scope
		new Product().vcube(); //4) anonymous object
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.gc();

	}

}
