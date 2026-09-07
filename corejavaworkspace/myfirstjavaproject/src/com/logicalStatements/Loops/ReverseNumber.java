package com.logicalStatements.Loops;

import java.util.Scanner;

public class ReverseNumber {
	static int reverseNumber(int n) {
		int rn = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;// 123%10-->3, 12%10-->2, 1%10-->1
			n = n / 10;// 123/10-->12, 12/10-->1, 1/10-->0
			rn = rn * 10 + r;//3*10 + 2-->32*10-->320 + 1-->321
		}
		return rn;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int reverseNumber = reverseNumber(n);

		System.out.println("reverse number of given number: " + reverseNumber);
		
		if(reverseNumber == n) {
			System.out.println("given number is a palandrome");
		}else {
			System.out.println("given number is not a palandrome");
		}
		System.out.println("main method ended");
		
		sc.close();
	}

}
