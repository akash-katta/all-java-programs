package com.logicalStatements.Loops;

import java.util.Scanner;

public class TestDemo01 {
    static void print() {
    	for(int i=1;i<=10;i++) {
    		System.out.println(i);
    	}
    }
  
    static void evenNumbers() {
    	for(int i=2;i<=10;i++) {
    		if(i % 2==0) {
    			System.out.println(i);
    		}
    	}
    }
    
    static void sum(int n) {
    	int sum =0;
    	for(int i=0;i<n;i++) {
    		sum += i;
    System.out.println("sum: "+ sum);		
    	}
    }
    
    static void fact(int n) {
    	for(int i=1;i<=n;i++) {
    		if(n % i ==0) {
    	System.out.println("factorial: "+ i);	
    	}
    }
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1=0;
	int n2=1;
	
	int n3=0;
	System.out.println("enter a number: ");
	int n = sc.nextInt();
	System.out.println(n1 +" "+ n2);
	for(int i=1;i<=n;i++) {
		n3=n1+n2;
		System.out.println(" "+ n3);
		n1=n2;
		n2=n3;
	}
	
//    print();
//    evenNumbers();
//    sum(n);
	  fact(n);
	}

}
