package com.javaintroduction;

public class testdemo1 {
	static testdemo1 t=new testdemo1();
	static void method1() {
		System.out.println("method1 called");
		method2();
	}
	static void method2() {
		System.out.println("method2 called");
		
	}
	void method3() {
		System.out.println("method3 called");
		method4();
	}
	void method4() {
		System.out.println("method4 called");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		t.method3();
    }
}
