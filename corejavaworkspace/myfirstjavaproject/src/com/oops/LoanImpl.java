package com.oops;

import java.util.Scanner;

public class LoanImpl implements Loan{

	Scanner sc = new Scanner(System.in);
    @Override
	public boolean isPhoneValid() {
		System.out.println("enter phone number");
		String phone = sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}
    @Override
	public boolean isAdhaarValid() {
		System.out.println("enter your adhaar number");
		String adhaar=sc.next();
		return adhaar.matches("[1-9]{1}[0-9]{11}");
	}
    @Override
	public boolean isPanValid() {
		System.out.println("enter your pan number");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
    @Override
	public double getLoanROI() {
		double roi = 8.5;
		int cibil=getCibilScore();
		if(cibil >=300 && cibil<=559) {
			System.out.println("high risk");
			roi = roi + 4.0;
		}else if(cibil >=550 && cibil<=699) {
			System.out.println("moderate risk");
			roi = roi + 2.0;
		}else if(cibil >=700 && cibil<=990) {
			System.out.println("excellent");
			roi= roi+0.5;
		}else {
			System.out.println("invalid cibil information");
			roi = roi+10;
		}
		return roi;
	}
    @Override
	public int getCibilScore() {
		System.out.println("enter yoyr cibil score");
		int cibil = sc.nextInt();
		return cibil;
	}
    @Override
	public double getCustomerSalary() {
		System.out.println("enter customer salary");
		double salary = sc.nextDouble();
		return salary;
	}
    @Override
	public int getcustomrAge() {
		System.out.println("enter customer age");
		int age = sc.nextInt();
		return age;
	}
}

