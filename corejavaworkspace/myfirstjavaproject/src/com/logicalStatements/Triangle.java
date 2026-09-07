package com.logicalStatements;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter first side");
    int a = sc.nextInt();
    
    System.out.println("enter second side");
    int b = sc.nextInt();
    
    System.out.println("enter third side");
    int c = sc.nextInt();
    
    if(a<=0 || b<=0 || c<=0) {
    	System.out.println("all sides must be greater than 0");
    }else if((a+b>c)&&(b+c>a)&&(c+a>b)) {
    	System.out.println("valid triangle");
    }else {
    	System.out.println("invalid");
    }
    sc.close();
	}

}
