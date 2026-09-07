package com.logicalStatements.Loops;

import java.util.Scanner;

public class PrimeNumbers {
	static boolean isPerfect(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			status = false;
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
		System.out.println("enter a number up to where you want to print");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (isPerfect(i)) {
				System.out.println(i);
        // to check weather prime or not
        // int a = sc. nextInt();
        // boolean flag = isPrine(a);
        // if(flag){
        //System.out.println("is a prime");
        //}else {
        //System.out.println("not prime");
        //}
			}
		}
		sc.close();
	}

}
