package com.languageFundamentals.constructors;

public class Car {
	String brand;
	String model;
	String ownerName;
	int year;
	String fuel;
	
	Car(){
		this("unknown");
		System.out.println("no arg");
	}
	Car(String brand){
		this(brand,"unknown");
		System.out.println("1 arg");
	}
	Car(String brand,String model){
		this(brand,model,"unknown");
		System.out.println("2 arg");
	}
	Car(String brand,String model,String ownerName){
		this(brand,model,ownerName,2026);
		System.out.println("3 arg");
	}
	Car(String brand,String model,String ownerName,int year){
		this(brand,model,ownerName,year,"unknown");
		System.out.println("4 arg");
	}
	Car(String brand,String model,String ownerName,int year,String fuel){
		this.brand=brand;
		this.model=model;
		this.ownerName=ownerName; 
		this.year=year;
		this.fuel=fuel;
	}
	void show() {
		System.out.println("--------------------------------------");
		System.out.println("brand of car:="+brand);
		System.out.println("model of car:="+model);
		System.out.println("ownerName of car:="+ownerName);
		System.out.println("year of car:="+year);
		System.out.println("fuel of car:="+fuel);
		System.out.println("--------------------------------------");

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Car c1=new Car();
		c1.show();
		Car c2=new Car("kia");
		c2.show();
		Car c3=new Car("tata","punch");
		c3.show();
		Car c4=new Car("bmw","b22","akash");
		c4.show();
		Car c5=new Car("benz","g900","akash",2026);
		c5.show();
		Car c6=new Car("skoda","skoda","ram",2026,"petrol");


	}

}
