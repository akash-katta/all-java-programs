package com.logicalStatements;

import java.util.Scanner;

public class LuxuryHotel {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter rating");
    double rating = sc.nextDouble();
    
    if(rating<0 || rating>5) {
    	System.out.println("invalid rating");
    }else if(rating>4) {
    	System.out.println("excellent");
    }else if(rating>3) {
    	System.out.println("good");
    }else if(rating>2) {
    	System.out.println("better");
    }else if(rating>1) {
    	System.out.println("bad");
    }else if(rating>0) {
    	System.out.println("very bad");
    }
    sc.close();
	}

}
