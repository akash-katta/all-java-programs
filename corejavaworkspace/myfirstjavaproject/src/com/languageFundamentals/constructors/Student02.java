package com.languageFundamentals.constructors;

public class Student02 {
	int sid;
	String sname;
	int age;
	char gender;
	int rollNumber;
	String course;
	String branch;
	char section;
	int semester;
	int year;

	Student02(int id, String name) {
		System.out.println("p constructr called");
		sid = id;
		sname = name;
	}
	Student02(int age, char gender, int rollnumber){
		System.out.println("p2 called");
		this.age= age;
		this.gender=gender;
		this.rollNumber=rollnumber;
	}
	
	Student02(String c,String b,char s){
		System.out.println("p3 called");
		course=c;
		branch=b;
		section=s;
	}
	
	public Student02(int sem, int y) {
		semester = sem;
		year = y;
	}

	public static void main(String[] args) {
		
		Student02 s1 = new Student02(102, "ram");
		System.out.println("student ID:"+s1.sid);
		System.out.println("student Name:"+s1.sname);
		System.out.println("------------------------------------");
		
		Student02 s2 = new Student02(22,'m',21);
		System.out.println("student age:"+s2.age);
		System.out.println("student gender:"+s2.gender);
		System.out.println("student rollnumber:"+s2.rollNumber);
		System.out.println("------------------------------------");

		
		Student02 s3= new Student02("jfs","ece",'a');
		System.out.println("student course:"+s3.course);
		System.out.println("student branch:"+s3.branch);
		System.out.println("student section:"+s3.section);
		System.out.println("------------------------------------");

		
		Student02 s4= new Student02(8,4);
		System.out.println("student semester:"+s4.semester);
		System.out.println("student year:"+s4.year);
		System.out.println("------------------------------------");

	}
	

}

