package com.oops;

class Student implements Cloneable{
	int id;
	String name;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}
}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("hyderabad");
		Student s1 = new Student(101, "akash", address);

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println("---------------------------------");

		Student s2 = (Student) s1.clone();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println("---------------------------------");
		
		s2.id=102;
		s2.name="sundhar";
		s2.address.city="karimanagar";
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		System.out.println("---------------------------------");
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println("---------------------------------");
	}

}
