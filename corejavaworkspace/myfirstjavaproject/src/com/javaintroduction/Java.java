package com.javaintroduction;

class A {
    B b;
    @Override
    protected void finalize() throws Throwable {
    	System.out.println("finalize from A");
    }
}

class B {
    A a;
    @Override
    protected void finalize() throws Throwable {
    	System.out.println("finalize from b");
    }
}

public class Java {

	public static void main(String[] args) {
    System.out.println("main method started");
    A obj1 = new A();
    B obj2 = new B();
    
    obj1.b = obj2;
    obj2.a = obj1;
    obj1 = null;
    obj2 = null;
    System.out.println("main method ended");
    System.gc();
	}

}
