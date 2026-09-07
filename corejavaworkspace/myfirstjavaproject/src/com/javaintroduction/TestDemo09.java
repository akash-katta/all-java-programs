package com.javaintroduction;

import java.util.Scanner;

public class TestDemo09 {

	public static void main(String[] args) {
		TestDemo09 t1 = new TestDemo09();
		
		Scanner sc = new Scanner(System.in); 
		
	        
	    System.out.println("enter first name:");
		String fname =sc.nextLine();
		
		System.out.println("enter last name:");
		String lname = sc.nextLine();
		
		System.out.println("enter age:");
        int age = sc.nextInt();
        
        System.out.println("enter height:");
        float height = sc.nextFloat();
        
        System.out.println("enter weight");
        double weight = sc.nextDouble();
        
        System.out.println("enter city");
        sc.nextLine();
        String city = sc.nextLine();
        
        System.out.println("enter course");
        String course = sc.nextLine();
        
        System.out.println("enter rollnumber");
        int rollnumber = sc.nextInt();
        
        System.out.println("enter cgpa");
	    float cgpa = sc.nextFloat();
	    
	    System.out.println("enter salary");
	    double salary = sc.nextDouble();
	    
	    System.out.println("enter gender:");
	    char gender= sc.next().charAt(0);
	    
	    System.out.println("isPassed? (true/false): ");
	    boolean result = sc.nextBoolean();
	    
	    System.out.println("enter company name");
	    sc.nextLine();
	    String company=sc.nextLine();
	    
	    System.out.println("enter total marks:");
	    int marks= sc.nextInt(); 
	    
	    System.out.println("enter temperature");
	    float temp= sc.nextFloat();
	    
	    System.out.println("enter price");
	    double price = sc.nextDouble();
	    
	    System.out.println("section");
	    char section=sc.next().charAt(0);
	    
	    System.out.println("isPresent (true/false)");
	    boolean attendence= sc.nextBoolean();
	    
        
        t1.getName(fname,lname);
		t1.getAge(age);
		t1.getHeight(height);
		t1.getWeight(weight);
		t1.cityInfo(city);
		t1.courseInfo(course);
		t1.studentRollno(rollnumber);
		t1.studentCgpa(cgpa);
		t1.empSalary(salary);
		t1.gender(gender);
		t1.result(result);
		t1.companyName(company);
		t1.totalMarks(marks);
		t1.temperature(temp);
		t1.getPrice(price);
		t1.getSection(section);
        t1.getAttendence(attendence);
		}
	void getAttendence(boolean attendence) {
		System.out.println("attendence:"+attendence);
	}
	void getSection(char section) {
		System.out.println("section:"+section);
	}
	void getPrice(double price) {
		System.out.println("Price:"+price);
	}
	
	void temperature(float temp) {
		System.out.println("temperature:"+temp);
	}
	void companyName(String company) {
		System.out.println("company name:"+company);
	}
	void totalMarks(int marks) {
		System.out.println("total marks:"+marks);
	}
	
	void result(boolean passed) {
		System.out.println("passed:"+passed);
	}
	void gender(char gender) {
		System.out.println("gender:"+gender);
	}
	void empSalary(double salary) {
		System.out.println("Salary:"+salary);
	}
	void studentCgpa(float cgpa) {
		System.out.println("CGPA:"+cgpa);
	}
	void studentRollno(int rollnumber) {
		System.out.println("rollnumber:"+ rollnumber);
	}
	void courseInfo(String course) {
		System.out.println("course name:"+course);
	}
	void cityInfo(String city) {
		System.out.println("city:"+city);
		
	}
	void getName(String fname , String lname) {
		System.out.println("full name:"+fname+" "+lname);
	}
	
	void getAge(int age) {
		System.out.println("age:"+ age);
	}
	void getHeight(float height) {
		System.out.println("Height:"+height);
	}
	void getWeight(double weight) {
		System.out.println("weight:"+weight);
	}

}
