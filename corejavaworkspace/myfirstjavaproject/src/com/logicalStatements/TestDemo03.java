package com.logicalStatements;

import java.util.Scanner;

public class TestDemo03 {

	public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);
    
    System.out.println("enter month number: ");
    int month = sc.nextInt();
    
    switch(month) {
    case 1 -> {
    	System.out.println("the month is Jan");
    }
    case 2 ->{
    	System.out.println("feb");
    	
    }
    case 3 ->{
    	System.out.println("march"); 
    }
    default -> System.out.println("invalid month");
    }
    
	}

}
