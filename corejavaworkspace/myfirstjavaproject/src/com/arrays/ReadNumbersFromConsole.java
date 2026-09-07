package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNumbersFromConsole {
	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("enter the numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int a : arr) {
			if (isPrime(a)) {
				System.out.print(a + " ");
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
