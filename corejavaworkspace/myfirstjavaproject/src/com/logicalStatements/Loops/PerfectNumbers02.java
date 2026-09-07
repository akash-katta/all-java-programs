package com.logicalStatements.Loops;

import java.util.Scanner;

public class PerfectNumbers02 {
    static void findPerfectNum(int n) {
    	int sum=0;
    	
    	for(int i=1;i<=n/2;i++) {
    		if(n % i==0) {
    			sum=sum + i;
    		}
    	}
    	if(sum == n) {
    		System.out.println(n + "is a perfect number");
    	}else {
    		System.out.println(n + "is not a perfect number");
    	}
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter a number: ");
    int n = sc.nextInt();
    findPerfectNum(n);
    sc.close();
	}

}
