package com.languageFundamentals.constructors;

public class Product {
	int productId;
	String productName;
	double price;
	
	Product(int pid, String pn,double p){
		System.out.println("parameterized connstructor called");
		productId = pid;
		productName = pn;
	    price = p; 
	}

	void display() {
		System.out.println("product ID:"+ productId);
		System.out.println("productName:"+ productName);
		System.out.println("price:"+ price);
	}
	
	public static void main(String[] args) {
		Product p = new Product(101,"watch",50000);
		p.display();
		

	}

}
