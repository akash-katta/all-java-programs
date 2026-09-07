package com.languageFundamentals.constructors;

public class Student {
	int sid;
	String sname;

	Student() {
		System.out.println("no arg constructor called");
	}

	Student(int id, String name) {
		System.out.println("p constructr called");
		sid = id;
		sname = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.sid);
		System.out.println(s1.sname);

		Student s2 = new Student();
		s2.sid = 101;
		s2.sname = "akash";
		System.out.println(s2.sid);
		System.out.println(s2.sname);

		Student s3 = new Student(102, "ram");
		System.out.println(s3.sid);
		System.out.println(s3.sname);
	}

}
