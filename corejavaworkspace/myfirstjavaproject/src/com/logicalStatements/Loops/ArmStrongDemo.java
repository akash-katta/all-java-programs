package com.logicalStatements.Loops;

import java.util.Scanner;

public class ArmStrongDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();

		boolean status = isArmstrong(n);

		if (status) {
			System.out.println("given number is armstrong");
		} else {
			System.out.println("given number is not armstrong");
		}
		sc.close();
	}

	static boolean isArmstrong(int n) {
		boolean status = false;
		int temp = n;
		int r = 0;
		int sumP = 0;

		String str = Integer.toString(n);
		int digitCount = str.length();

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (sumP == temp) {
			status = true;
		}
		return status;

	}

}
