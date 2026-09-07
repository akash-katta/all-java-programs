package com.operators;

import java.util.Scanner;

public class TestDemo01 {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("enter number:");
    int num= sc.nextInt();
    
    System.out.println("is the number in range: "+ ((num >=100 && num<=999)?"yes":"no"));
    System.out.println("multiply by 2: "+ (num<<2));
    System.out.println("divide by 2 :"+ (num>>2));
    System.out.println("even or odd: "+ ((num % 2==0)?"yes":"no") );
    
    
	}

}
