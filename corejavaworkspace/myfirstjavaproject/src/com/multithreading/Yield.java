package com.multithreading;

public class Yield extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("run: " + Thread.currentThread().getName() + "->" + i);
			Thread.yield();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Yield y = new Yield();
		y.start();
		

		for (int i = 0; i <= 10; i++) {
			System.out.println("main: " + Thread.currentThread().getName() + "->" + i);
		}
	}
}
