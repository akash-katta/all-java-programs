package com.logicalStatements;

import java.util.Scanner;

public class SwitchCase02 {
//1--->sunday
//2--->monday
//3--->tuesday
//4--->wednesday
//5--->thursday
//6--->friday
//7--->saturday
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number: ");
    int number = sc.nextInt();
    switch(number) {
//    case 1:
//    	System.out.println("sunday");
//    	break;
//    case 2:
//    	System.out.println("monday");
//    	break;
//    case 3:
//    	System.out.println("tuesday");
//    	break;
//    case 4:
//    	System.out.println("wednesday");
//    	break;
//    case 5:
//        System.out.println("thursday");
//    	break;
//    case 6:
//    	System.out.println("friday");
//    	break;
//    case 7:
//    	System.out.println("saturday");
//    	break;   	
//    default:
//    	System.out.println("date not found");
    
//  case 1 ->{
//    System.out.println("sunday");
//    System.out.println("sunday is a weekend");
    
    case 1 -> System.out.println("sunday");
    case 2 -> System.out.println("monday");
    case 3 -> System.out.println("tuesday");
    case 4 -> System.out.println("wednesday");
    case 5 -> System.out.println("tursday");
    case 6 -> System.out.println("friday");
    case 7 -> System.out.println("saturday");
    default -> System.out.println("invalid");

    }
	}

}
