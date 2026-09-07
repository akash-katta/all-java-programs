package com.logicalStatements.Loops;

import java.util.Scanner;

public class SumOfNumbers {

	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int n = sc.nextInt();
    
    int sum = 0;
    int r = 0;
    while(n>0) {
    	r = n % 10;//598%10-->8, 59%10-->9, 5%10-->5
    	n = n / 10;//598/10-->59, 59/10-->5, 5/10-->0
    	sum = sum + r;
    }
    System.out.println("sum: "+ sum);
    sc.close();
	}

}
