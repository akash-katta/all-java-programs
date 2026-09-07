package com.logicalStatements.Loops;

import java.util.Scanner;

public class DigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
			count++;
		}
		System.out.println("count is: "+ count);
		System.out.println("sum is: "+ sum);

		sc.close();
	}

}
