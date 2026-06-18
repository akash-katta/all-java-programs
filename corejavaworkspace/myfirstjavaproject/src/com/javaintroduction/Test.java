package com.javaintroduction;

public class Test {
	static int x=10;
	static {
		x=x+10;
	}
	{
	x=x+20;
	}

	public static void main(String[] args) {
System.out.println(x);
	new Test();
	System.out.println(x);
	}

}
