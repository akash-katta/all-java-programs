package com.logicalStatements;

import java.util.Scanner;

public class CreditScore {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter credit score");
    int creditScore= sc.nextInt();
    
    if(creditScore<300 || creditScore>900) {
    	System.out.println("invalid credit score");
    }else if(creditScore>=800){
    	System.out.println("excellent");
    }else if(creditScore>=700){
    	System.out.println("better");
    }else if(creditScore>=600){
    	System.out.println("good");
    }else if(creditScore<600){
    	System.out.println("poor");
    }
    sc.close();
	}

}
