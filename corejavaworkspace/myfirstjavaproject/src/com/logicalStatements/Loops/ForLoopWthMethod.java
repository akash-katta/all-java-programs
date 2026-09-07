package com.logicalStatements.Loops;

import java.util.Scanner;

public class ForLoopWthMethod {
	static void findFactors(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n % i==0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter a number: ");
    int n = sc.nextInt();
    findFactors(n);
    
    sc.close();
	}

}
