package com.logicalStatements;

import java.util.Scanner;

public class ATMusingSwitchCases {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int correctPin = 2004;
    double dailyLimit = 5000;
    double balance = 50000;
    
    System.out.println("enter the pin: ");
    int pin = sc.nextInt();
    
    switch(pin) {
    
    case 2004 -> {
    	System.out.println("enter the amount");
    	double amount = sc.nextDouble();
    	
    	if(amount <= dailyLimit) {
    		if(amount <= balance) {
    			balance = balance - amount;
    			System.out.println("withdrawal successful");
    			System.out.println("amount withdrawn: "+ amount);
    			System.out.println("remainig balance: "+ balance);
    		}else {
    			System.out.println("insufficient balance");
    		}
    	}else {
    		System.out.println("limit exceeded");
    	}
    }
    }  
    sc.close();
	}

}
