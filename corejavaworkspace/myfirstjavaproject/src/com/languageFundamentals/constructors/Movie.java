package com.languageFundamentals.constructors;

public class Movie {
	
	String mveName;
	String leadName;
	String director;
	int price;
	
   Movie(String mveName, String leadName, String director, int price) {
		this.mveName=mveName;
		this.leadName=leadName;
		this.director=director;
		this.price=price;		
	}
    Movie(String mveName, String leadName, String director) {
		this.mveName = mveName;
		this.leadName = leadName;
		this.director = director;
	}

	public static void main(String[] args) {
		Movie m1 = new Movie("rockstar","ranbir","imtiaz",200);
		m1.show();
		
		Movie m2 = new Movie("bahubali","prabhas","rajamouli");
		m2.show();

	}

	void show() {
		System.out.println("movie name:"+mveName);
		System.out.println("lead name:"+leadName);
		System.out.println("lead name:"+director);
		System.out.println("ticket price:"+price);
        System.out.println("-------------------------");
	}
	

}
