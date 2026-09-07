package com.logicalStatements;

import java.util.Scanner;

public class TestDemo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the marks :");
		double marks = sc.nextDouble();
		
		if(marks>100 || marks<0) {
			System.out.println("invalid marks");
		}else if(marks>=90) {
			System.out.println("grade A");
		}else if(marks>=80) {
			System.out.println("grade B");
		}else if(marks>=70) {
			System.out.println("grade C");
		}else if(marks>=60) {
			System.out.println("grade D");
		}else if(marks>=35) {
			System.out.println("passed");
		}else if(marks<35) {
			System.out.println("failed");
		}
	    sc.close();
	}
	

}
