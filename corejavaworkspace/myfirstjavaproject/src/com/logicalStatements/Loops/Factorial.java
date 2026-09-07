package com.logicalStatements.Loops;

import java.util.Scanner;

public class Factorial {
    static int Fact(int n) {
    	if(n==1 || n==0) {
    		return 1;
    	}
    	return Fact(n-1)*n;
    }
    
//private static int fingFactorial(int n){
//	int fact = 1;
//	for(int i=0; i>=1; i--) {
//		fact = fact * i;
//		
//	}
//	return fact;
//  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		
		int fact = Fact(n);
		System.out.println("factorial: " + fact);
		
	}

}
