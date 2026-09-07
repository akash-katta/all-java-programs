package com.operators;

import java.util.Scanner;

public class ComparingNumbers {

	public static void main(String[] args) {
    System.out.println("main method");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter frst number");
    int a = sc.nextInt();
    System.out.println("second number");
    int b= sc.nextInt();
    System.out.println("third number");
    int c = sc.nextInt();
    
    int largest= (a>b)?((a>c)?a:c):((b>c)?b:c);
    System.out.println("largest number: "+ largest
    		);
    sc.close();
    }

}
