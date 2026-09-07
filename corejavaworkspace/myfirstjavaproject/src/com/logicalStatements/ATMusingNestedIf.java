package com.logicalStatements;

import java.util.Scanner;

public class ATMusingNestedIf {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int correctPin = 2004;
    double balance = 50000.00;
    double dailyLimit = 5000.00;
    
    System.out.println("enter the pin: ");
    int enteredPin = sc.nextInt();
    
    if(enteredPin == correctPin) {
    	System.out.println("enter the withdrawal amount: ");
    	double amount = sc.nextDouble();
    	
    	if(amount <= dailyLimit) {
    		if(amount <= balance) {
    			balance = balance - amount;
    			System.out.println("withdrawal success");
    			System.out.println("amount withdrawn = "+ amount);
    			System.out.println("remaining balance = "+ balance);
    		}else {
    			System.out.println("insuficient balance");
    		}
    	}else {
    		System.out.println("exceeded daily limit");
    	}
    }else {
    	System.out.println("invalid pin");
    }
	}

}
