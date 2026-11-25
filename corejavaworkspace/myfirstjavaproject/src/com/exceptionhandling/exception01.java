package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception01 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
    int a=0;
    int b=0;
    
    try {
    	System.out.println("enter a number");
    	a = sc.nextInt();
    	System.out.println("enter another number");
    	b = sc.nextInt();
    }catch(InputMismatchException in) {
    	in.printStackTrace();
    }
    
    try {
    	System.out.println(a/b);
    }catch(ArithmeticException e) {
    	e.printStackTrace();
    }
       System.out.println("main method ended");
//--------------------------------------------------------
//		try {
//			System.out.println("enter a number");
//			int a = sc.nextInt();
//			System.out.println("enter another number");
//			int b = sc.nextInt();
//
//			System.out.println(a / b);
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		} catch (InputMismatchException in) {
//			in.printStackTrace();
//		}
//				System.out.println("main method ended");
//--------------------------------------------------------------       
	}

}
