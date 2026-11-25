package com.multithreading;

public class Demo3 implements Runnable {

	public static void main(String[] args) {

		System.out.println("main method");
		Demo3 mt = new Demo3();
		Thread mt1 = new Thread(mt);
		mt1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main" + i);
		}
		System.out.println("main method");
	}

	@Override
	public void run() {
		System.out.println("run method");
		for (int i = 0; i <= 10; i++) {
			System.out.println("run" + i);
		}
	}

}
