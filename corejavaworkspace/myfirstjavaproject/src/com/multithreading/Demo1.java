package com.multithreading;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("main method");
		Demo1 mt = new Demo1();
		mt.hello();
		mt.welcome();
		
	}
	void hello() {
		System.out.println("hello");
	}

	void welcome() {
		System.out.println("welcome");
	}
}
