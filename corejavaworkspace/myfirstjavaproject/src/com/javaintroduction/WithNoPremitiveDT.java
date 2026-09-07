package com.javaintroduction;

public class WithNoPremitiveDT {
	Integer eno;
	String eName;
	Double salary;
	String hireDate;
	Integer experirence;
//	{
//		Double annualSalary =salary * 12;
//		Double annualBonus=annualSalary*10/100;
//		Double totalAnnualEarnings= annualSalary+annualBonus;
//		
//		System.out.println("eno:"+eno);
//		System.out.println("eName:"+eName);
//		System.out.println("salary:"+salary);
//		System.out.println("hireDate:"+hireDate);
//		System.out.println("experirence:"+experirence);
//		System.out.println("annualSalary:"+annualSalary);
//		System.out.println("annualBonus:"+annualBonus);
//		System.out.println("totalAnnualEarnings:"+totalAnnualEarnings);
//	}
	void m() {
		Double annualSalary =salary * 12;
		Double annualBonus=annualSalary*10/100;
		Double totalAnnualEarnings= annualSalary+annualBonus;
		
		System.out.println("eno:"+eno);
		System.out.println("eName:"+eName);
		System.out.println("salary:"+salary);
		System.out.println("hireDate:"+hireDate);
		System.out.println("experirence:"+experirence);
		System.out.println("annualSalary:"+annualSalary);
		System.out.println("annualBonus:"+annualBonus);
		System.out.println("totalAnnualEarnings:"+totalAnnualEarnings);
	}
	public static void main(String[] args) {
		WithNoPremitiveDT w1=new WithNoPremitiveDT();
		w1.eno=101;
		w1.eName="krishna";
		w1.salary=500000.00;
		w1.hireDate="10/01/2026";
		w1.experirence=3;
		w1.m();
		WithNoPremitiveDT w2=new WithNoPremitiveDT();
		w2.eno=101;
		w2.eName="krishna";
		w2.salary=500000.00;
		w2.hireDate="10/01/2026";
		w2.experirence=3;
		w2.m();
	}

}
