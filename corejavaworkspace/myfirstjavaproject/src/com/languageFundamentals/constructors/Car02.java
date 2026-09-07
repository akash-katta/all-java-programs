package com.languageFundamentals.constructors;

class Vehicle {
	String model;
	String brand;
	double price;

	public Vehicle(String model, String brand, double price) {
			super();
			System.out.println("parametere=ized from vehicle");
			this.model = model;
			this.brand = brand;
			this.price = price;
	}
}
public class Car02 extends Vehicle {
	
//    Car02(){
//    	System.out.println("no arg");
//    
//    }
	public static void main(String[] args) {
		System.out.println("main method started");
		Car02 c = new Car02();
		
	}

	}


