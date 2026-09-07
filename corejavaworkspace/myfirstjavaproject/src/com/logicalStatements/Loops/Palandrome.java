package com.logicalStatements.Loops;

import java.util.Scanner;

public class Palandrome {
	static boolean isPalandrome(int n) {
	    int temp = n;
		int rn = 0;
		int r = 0;
		while (n > 0) {
			r = n % 10;// 123%10-->3, 12%10-->2, 1%10-->1
			n = n / 10;// 123/10-->12, 12/10-->1, 1/10-->0
			rn = rn * 10 + r;//3*10 + 2-->32*10-->320 + 1-->321
		}
        if(rn ==temp) {
        	return true;
        }else {
        	return false;
        }
	}
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
				
		if(isPalandrome(n)) {
			System.out.println("given number is palandrome");
		}else {
			System.out.println("given number is not palandrome");
		}
		
		sc.close();
	}

}
