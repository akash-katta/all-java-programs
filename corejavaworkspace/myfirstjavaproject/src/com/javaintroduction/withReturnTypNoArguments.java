package com.javaintroduction;

import java.util.Scanner;

public class withReturnTypNoArguments {
     
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		withReturnTypNoArguments w1 = new withReturnTypNoArguments();
		System.out.println("main method started");
		
		double sal=w1.getSalary();
		double bonus=w1.getBonus();
		
		int mMarks=w1.getMathsMarks();
		int eMarks=w1.getEngMarks();
		
		int length=w1.getLength();
		int breadth=w1.getBreadth();
		int height=w1.getHeight();
		
		int p=w1.getProductPrice();
		int e=w1.getElectricityBill();
		int pe=w1.getPetrolPrice();
		
		int pri=w1.getPrincipleAmount();
		int r=w1.getRate();
		int t=w1.getTime();
		
		System.out.println("tota salary:"+(sal+bonus));
		System.out.println("total marks:"+(mMarks+eMarks));
		System.out.println("average of marks:"+(mMarks+eMarks)/2);
		System.out.println("area of triangle:"+(length*breadth));
		System.out.println("cuboid volume:"+(length*breadth*height));
        System.out.println("total expenditure:"+(p+e+pe));
        System.out.println("simple intrest:"+(pri*r*t/2));
	}
	double getSalary() {
		System.out.println("enter salary:");
		double salary = sc.nextDouble();
		return salary;
	}
	double getBonus() {
		System.out.println("enter bonus:");
		double bonus = sc.nextDouble();
		return bonus;
	}
	int getMathsMarks() {
		System.out.println("enter maths marks");
		int mMaths=sc.nextInt();
		return mMaths;
	}
	int getEngMarks() {
		System.out.println("enter english marks");
		int eMarks=sc.nextInt();
		return eMarks;
	}
	
	int getLength() {
		System.out.println("enter length");
		int length=sc.nextInt();
		return length;
	}
	int getBreadth() {
		System.out.println("enter breadth");
		int breadth = sc.nextInt();
		return breadth;
	}
	int getHeight() {
		System.out.println("enter height");
		int height=sc.nextInt();
		return height;
	}
	int getProductPrice() {
		System.out.println("enter product price");
		int product=sc.nextInt();
		return product;
	}
	int getElectricityBill() {
		System.out.println("enter electricity bill");
		int electricity=sc.nextInt();
		return electricity;
	}
	int getPetrolPrice(){
		System.out.println("enter petrol price");
		int petrol=sc.nextInt();
		return petrol;
	}
	int getPrincipleAmount() {
		System.out.println("enter amount :");
		int amount=sc.nextInt();
		return amount;
	}
	int getRate() {
		System.out.println("enter rate of intrest:");
		int rate= sc.nextInt();
		return rate; 
	}
	int getTime() {
		System.out.println("enter time:");
		int time=sc.nextInt();
		return time;
	};

}
