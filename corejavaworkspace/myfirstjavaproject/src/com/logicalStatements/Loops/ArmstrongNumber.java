package com.logicalStatements.Loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();

		boolean status = isArmstrong(n);

		if (status) {
			System.out.println("given number is armstrong number");
		} else {
			System.out.println("given number is not armstrong number");
		}
	}

	static boolean isArmstrong(int n) {
		boolean status = false;
		int temp = n;
//		int n1 = n;
		int sumP = 0;
		int r = 0;
//		int count = 0;

		String str = Integer.toString(n);
		int digitCount = str.length();

//		while (n1 > 0) {
//			n1 = n1 / 10;
//			count++;
//		}

		while (n > 0) {
			r = n % 10;
			n = n / 10;
//			sumP = sumP + r * r * r;
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}
		if(sumP == temp) {
			status = true;
		}
		return status;
	}
}
