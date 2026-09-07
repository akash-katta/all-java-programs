package com.logicalStatements.Loops;

import java.util.Scanner;

//WAP to print 10 fibonacci series values
//0 1 2 3 5 8 13 21 34 55
public class Fibonacci {
    static void Fib(int n) {
    	int n1 = 0;
    	int n2 = 1;
    	
    	int n3 = 0;
    	System.out.print(n1+" "+n2);
    	for(int i = 1; i <= n; i++) {
    		n3 = n1 +n2;
    		System.out.print(" "+ n3);
    		n1 = n2;
    		n2 = n3;
    	}
    }
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		
		Fib(n);
		
		sc.close();
	}

}
