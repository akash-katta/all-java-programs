package com.operators;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
    
	System.out.println("enter frst number:");
	int a = sc.nextInt();
	System.out.println("enter second number:");
	int b = sc.nextInt();   
	System.out.println("enter third number:");
	int c = sc.nextInt();  
	
    int smallest= (a<b)?((a<c)?a:c)
                  :((b<c)?b:c);
                  
    System.out.println("smallest number:" + smallest);              
    		
	}

}
