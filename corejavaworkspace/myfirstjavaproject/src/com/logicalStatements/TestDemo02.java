package com.logicalStatements;

import java.util.Scanner;

public class TestDemo02 {
    
	static String getGradeDetails(String grade) {
		String gradeDetails = switch(grade) {
		case "A" ->{
			System.out.println("A grade means more than 90%");
			yield "Excellent";	
		}
		case "B" -> {
			System.out.println("B grade means more than 80%");
			yield "good";
		}
		case "C" -> {
			System.out.println("C grade means more than 70");
			yield "bad";
		}
		default ->"failed";
		};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the grade");
		String grade = sc.next();
		
		String details = getGradeDetails(grade);
        System.out.println("grade details: "+ details);
	}

}
