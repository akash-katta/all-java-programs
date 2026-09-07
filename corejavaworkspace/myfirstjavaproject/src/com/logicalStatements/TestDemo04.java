package com.logicalStatements;

import java.util.Scanner;

public class TestDemo04 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter frst number");
    double a = sc.nextDouble();
    
    System.out.println("enter second number");
    double b = sc.nextDouble();
    
    System.out.println("enter what area to find like add,multiply");
    String shape=sc.next();
    
    double result=0;
    
    switch(shape) {
    case "add" ->result= a+b;
    case "multiply" -> result = a*b;
    default -> {
    	result=0;
    	System.out.println("invalid");
    }
    }
    System.out.println("result is :"+ result);
	}

}
