package com.logicalStatements.Loops;

import java.util.Scanner;

public class DecimalToBinary {
	static void convertDecimalToBinary(int n) {
		int r = 0;
		String bin = "";
		while (n > 0) {
			r = r % 10;// 10%2==0, 5%2==1, 2%2==0, 1%2==1
			n = n / 10;// 10/2==5, 5/2==2, 2/2==1 1/2==0

			// concatenation
			bin = r + bin;
		}
		System.out.println("binary value of given number is: " + bin);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();

		convertDecimalToBinary(n);
		
		sc.close();
	}

}
