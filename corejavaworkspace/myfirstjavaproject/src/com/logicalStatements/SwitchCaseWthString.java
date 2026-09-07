package com.logicalStatements;

import java.util.Scanner;

public class SwitchCaseWthString {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter a day: ");
    String day = sc.next().toUpperCase();
    
    switch(day) {
    case "SUNDAY" -> System.out.println("funday!!");
    case "MONDAY" -> System.out.println("week start!!");
    case "TUESDAY","WEDNESDAY","THURSDAY"-> System.out.println("week day!!");
    case "FRIDAY" -> System.out.println("week end eve");
    case "SATURDAY" -> System.out.println("week end");
    default -> System.out.println("invalid entry");   
    }
    sc.close();
	}

}
