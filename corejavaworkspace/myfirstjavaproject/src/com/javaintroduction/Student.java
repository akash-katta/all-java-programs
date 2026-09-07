package com.javaintroduction;

public class Student {
	String studenName="Akash";
	int rollNumber=21;
	int age=22;
	char gender='M';
	char section='A';
	
	int m1=88;
	int m2=78;
	int m3=98;
	int m4=68;
	int m5=77;
	
	void display() {
		int total=m1+m2+m3+m4+m5;
		float percentage= total/5.0f;
		
		char grade;
		boolean passed;
		
		if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35)
			passed=true;
		else
			passed=false;
		
		if(percentage>=90)
			grade ='A';
		else if(percentage>=70)
			grade ='B';
			else 
				grade = 'F';
		
		System.out.println("studenName=:"+studenName);
		System.out.println("rollNumber=:"+rollNumber);
		System.out.println("age=:"+age);
		System.out.println("gender=:"+gender);
		System.out.println("section=:"+section);
		System.out.println("total=:"+total);
		System.out.println("percentage=:"+percentage);
		System.out.println("grade=:"+grade);
		System.out.println("passed=:"+passed);
		
		
		
	}
	
	

	public static void main(String[] args) {
    Student s= new Student();
    s.display();
	}

}
