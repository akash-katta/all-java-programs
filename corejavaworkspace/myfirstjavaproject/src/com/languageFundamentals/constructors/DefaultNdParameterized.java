package com.languageFundamentals.constructors;

public class DefaultNdParameterized {
	int sid;
	String sname;
	DefaultNdParameterized(){
		System.out.println("default construster called");
		sid =101;
		sname="nehal";
	}
	
	DefaultNdParameterized(int sid, String sname){
		System.out.println("parameterized constructor called");
		this.sid=103;
		this.sname="ram";
	}
	public static void main(String[] args) {
		DefaultNdParameterized d1 =new DefaultNdParameterized();
		System.out.println(d1.sid);
		System.out.println(d1.sname);
		
		DefaultNdParameterized d2 =new DefaultNdParameterized(102,"ram");
		System.out.println(d2.sid);
		System.out.println(d2.sname);
		
	}

}
