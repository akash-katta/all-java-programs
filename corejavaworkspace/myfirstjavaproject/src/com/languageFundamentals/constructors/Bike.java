package com.languageFundamentals.constructors;

public class Bike {
    String brand;
    String model;
    String color;
    double price;
    int year;
    double milage;
    
    Bike(){
    	this("unknown");
    	System.out.println("no arg");
    }
    Bike(String brand){
    	this(brand,"unknown");
    	System.out.println("1 arg");
    }
    Bike(String brand, String model){
    	this(brand,model,"unknown");
    	System.out.println("2 arg");  	
    }
    
    Bike(String brand, String model, String color) {
    	this(brand,model,color,500000.00);
    	System.out.println("3 arg");
	}
    
     Bike(String brand, String model, String color, double price) {
    	 this(brand,model,color,price,2026);
     	System.out.println("4 arg");
	}
     
	 Bike(String brand, String model, String color, double price, int year) {
		 this(brand,model,color,price,year,50.00);
	    System.out.println("5 arg");
	}
	 
	 Bike(String brand, String model, String color, double price, int year, double milage) {
		 System.out.println("6 arg");
		 this.brand=brand;
		 this.model=model;
    	 this.color=color;
    	 this.price=price;
    	 this.year=year;
    	 this.milage=milage;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Bike b = new Bike();
		b.bikeInfo();
		Bike b1 = new Bike("suzuki");
		b1.bikeInfo();
		Bike b2 = new Bike("pulsar","n160");
		b2.bikeInfo();
		Bike b3 = new Bike("java","perek","green");
		b3.bikeInfo();
		Bike b4 = new Bike("honda","activa","white",100000.00);
		b4.bikeInfo();
		Bike b5 = new Bike("sesg","dff","fsffw",6515165.00,2026);
		b5.bikeInfo();
		Bike b6 = new Bike("gggegrerg","rgegrh","fhfdfh",6595615.00,2026,45);
		b6.bikeInfo();
	}
    void bikeInfo(){
    	System.out.println("------------------------------");
    	System.out.println("brand of bike:"+brand);
    	System.out.println("model of bike:"+model);
    	System.out.println("color of bike:"+color);
     	System.out.println("price of bike:"+price);
    	System.out.println("year of bike:"+year);
    	System.out.println("milage of bike:"+milage);
    	System.out.println("------------------------------");


    	
    }
}
