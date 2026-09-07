package com.logicalStatements.Loops;

import java.util.Scanner;

public class GCDandLCM {
    static void GCDandLCM(int a, int b) {
    	int gcd=1;
    	// to find gcd
    	for(int i=1;i<=a && i<=b;i++) {
    		if(a % i==0 && b % i==0) {
    			gcd = i;
    		}
    	}
    	// to find lcm
    	int max = (a>b)?a:b;
    	
    	for(int i=max;;i++) {
    		if(i % a==0 && i % b==0) {
    			System.out.println("LCM: "+ i);
    			break;
    		}
    	}
    	
    	System.out.println("GCD: "+ gcd);   	
    }
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter first number: ");
    int a = sc.nextInt();
    
    System.out.println("enter second number: ");
    int b = sc.nextInt();
    
    GCDandLCM(a, b);
    sc.close();
	}

}
