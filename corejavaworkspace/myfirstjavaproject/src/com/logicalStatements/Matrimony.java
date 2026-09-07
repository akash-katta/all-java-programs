package com.logicalStatements;

import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		System.out.println("welcome to matrimony");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name: ");
		String name=sc.nextLine();
		System.out.println("welcome Mr : "+ name);
		
		System.out.println("enter your asserts:");
		double asserts = sc.nextDouble();
		
		System.out.println("enter your salary");
		double salary = sc.nextDouble();
		
		if(asserts>=500000000.00 && salary>=2500000) {
			System.out.println("lets strt discussion");
			
			System.out.println("enter age:");
			int age=sc.nextInt();
			
			if(age>=26 && age<=28) {
				System.out.println("next question");
				
				System.out.println("enter height:");
				double height=sc.nextDouble();
				System.out.println("enter weight:");
				double weight=sc.nextDouble();
				
				if((height>5.5 && height<6.0)&&(weight>=65 && weight<=85)) {
					System.out.println("next question:");
					
					System.out.println("any bad habbits");
					boolean badHabbits = sc.nextBoolean();
					
					if(!badHabbits) {
						System.out.println("nxt");
					}else {
						System.out.println("not matched");
					}
					
				}else {
					System.out.println("height or weight not matched");
				}
				
			}else {
				System.out.println("age doesnt matched");
			}
		}else {
			System.out.println("end of discussion");
		}
		
	}

}
