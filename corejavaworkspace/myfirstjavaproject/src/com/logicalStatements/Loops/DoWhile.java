package com.logicalStatements.Loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String yn = " ";
    do{
		System.out.println("hello");
		System.out.println("do you want to continue?");
		yn = sc.next();
	}while(yn.equalsIgnoreCase("y"));
     System.out.println("EXIT");
	}

}
