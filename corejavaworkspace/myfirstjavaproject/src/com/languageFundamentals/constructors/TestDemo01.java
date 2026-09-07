package com.languageFundamentals.constructors;

class vehicle{
	String brand="nexon";
	String model="tata";
	double price=1500000.00;
}

class car extends vehicle{
	String brand="seltos";
	String model="kia";
	double price=2000000.00;

void show() {
	System.out.println("brand of car:"+super.brand);
	System.out.println("model of car:"+super.model);
	System.out.println("price of car:"+super.price);
}

void display() {
	System.out.println("brand of car:"+this.brand);
	System.out.println("model of car:"+this.model);
	System.out.println("price of car:"+this.price);
}
}
public class TestDemo01 {

	public static void main(String[] args) {
		car c1=new car();
		c1.show();
		c1.display();
	}

}
