package com.logicalStatements;

import java.util.Scanner;

public class SwitchCaseWthSymbl {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("enter frst number: ");
    double a = sc.nextDouble();
    
    System.out.println("enter second number: ");
    double b = sc.nextDouble();
    
    System.out.println("enter any symbol to continue like + - * / %");
    String symb = sc.next();
    
    double result=0;
    
    switch(symb) {
    
    case "+" -> result = a+b; 
    case "-" -> result = a-b; 
    case "*" -> result = a*b; 
    case "/" -> result = a/b; 
    case "%" -> result = a%b; 
    default -> {
    	result =0;
    	System.out.println("invalid symbol");
    }
    }
    System.out.println("result is: "+ result);
    sc.close();
	}
	

}
