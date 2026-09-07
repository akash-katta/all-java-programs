package com.logicalStatements.Loops;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
//    int n = 9;
//    for(int i=1; i<=10; i++) {
//    	System.out.println(n + " X " + i + " = " + (n*i));
//    }
	
	System.out.println("math table");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number for math table:  ");
    int n = sc.nextInt();
    System.out.println("enter up to where you want: ");
    int n1 = sc.nextInt();
    for(int i=1; i<=n1; i++) {
    	System.out.println(n + " X " + i + " = " + (n*i));
    }
    
	}

}
