package com.languageFundamentals.constructors;
class Person{
	int cId;
	String cName;
	int age;
	double price;
	
	Person(){
		System.out.println("no arg from parent");
	}
	
	public Person(int cId, String cName, int age, double price) {
		System.out.println("parameterized from parent");
		this.cId = cId;
		this.cName = cName;
		this.age = age;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("parent class");
		
	
	}
	void show() {
		System.out.println("--------------------------");
		System.out.println("cid:"+cId);
		System.out.println("cname:"+cName);
		System.out.println("age:"+age);
		System.out.println("price:"+price); 
		System.out.println("--------------------------");

		
	}
	
	}
public class Customer extends Person{
	
	Customer() {
		System.out.println("no arg from child");
	}
    Customer(int cId,String cName,int age,double price){
    	super(cId,cName,age,price);
    	System.out.println("parameterized from child");
    	
    }
	public static void main(String[] args) {
		System.out.println("child class");
		
		Customer c1 = new Customer();
		c1.show();
        Customer c2 = new Customer(101,"akash",22,1500.00);
        c2.show();
	}

}
