package com.exceptionhandling;

public class FinallyExit {

	public static void main(String[] args) {

		System.out.println("main method strted");
		System.out.println(hello());
		System.out.println("main method ended");
	}

	static int hello() {
		try {
			System.exit(0);
			return 5;
		} catch (Exception e) {
			return 10;
		} finally {
			return 100;
		}

	}

}
