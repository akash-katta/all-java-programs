package com.logicalStatements.Loops;

import java.util.Scanner;

public class PerfectNumbers03 {
	static boolean isPerfect(int n) {
		boolean b = false;
		int sum = 0;
		
		for(int i=1; i <= n/2; i++) {
			if(n % i ==0) {
				sum=sum+i;
			}
		}
		if(sum == n) {
			b = true;
		}
		return b;
	}

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("entr a number: ");
    int n = sc.nextInt();
    
    boolean status = isPerfect(n);
    
    if(status) {
    	System.out.println("perfect number");
    }else {
    	System.out.println("not perfect number");
    }
    
	}

}
