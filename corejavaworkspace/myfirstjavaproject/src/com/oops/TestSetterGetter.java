package com.oops;

public class TestSetterGetter {

	public static void main(String[] args) {

		SetterGetter sg = new SetterGetter();
		
		sg.setEid(21);
		sg.setEname("akash");
		sg.setSalary(180000.00);
		
		System.out.println(sg.getEid());
		System.out.println(sg.getEname());
		System.out.println(sg.getSalary());
//		sg.eid=18;
//		sg.ename="akash";
//		sg.salary=100000.00;
//		System.out.println(sg.eid);
//		System.out.println(sg.ename);
//		System.out.println(sg.salary);

	}

}
