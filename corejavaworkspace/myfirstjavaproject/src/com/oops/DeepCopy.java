package com.oops;

class Student1{
	int id;
	String name;
	Address1 address1;
	public Student1(int id, String name, Address1 address1) {
		super();
		this.id = id;
		this.name = name;
		this.address1 = address1;
	}
	public Student1(Student1 st1) {
		this.id=st1.id;
		this.name=st1.name;
		this.address1=new Address1(st1.address1);
	}
}
class Address1{
	String city;

	public Address1(Address1 a1) {
		this.city=a1.city;
	}
	public Address1(String city) {
		super();
		this.city = city;
	}
}
public class DeepCopy {

	public static void main(String[] args) {

		Address1 address1 = new Address1("karimnagar");
		Student1 st1 = new Student1(101,"akash",address1);
		System.out.println(st1.id);
		System.out.println(st1.name);
		System.out.println(st1.address1.city);
		System.out.println("--------------------------------------");
		
		Student1 st2 = new Student1(st1);
		System.out.println(st2.id);
		System.out.println(st2.name);
		System.out.println(st2.address1.city);
		System.out.println("--------------------------------------");
		
		st2.id=102;
		st2.name="ram";
		st2.address1.city="hyd";
		System.out.println("--------------------------------------");

		System.out.println(st1.id);
		System.out.println(st1.name);
		System.out.println(st1.address1.city);
		System.out.println("--------------------------------------");

		System.out.println(st2.id);
		System.out.println(st2.name);
		System.out.println(st2.address1.city);
		System.out.println("--------------------------------------");

		

	}

}
