package com.multithreading;

public class Demo2 extends Thread{

	public static void main(String[] args) {
		System.out.println("main method");
		
		Demo2 mt = new Demo2();
		mt.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main" + i);
		}
		System.out.println("main method");

	}

	@Override
	public void run() {
		System.out.println("hello method started");
		for (int i = 0; i <= 10; i++) {
			System.out.println("hello" + i);
		}
		System.out.println("hello method ended");

	}
}
