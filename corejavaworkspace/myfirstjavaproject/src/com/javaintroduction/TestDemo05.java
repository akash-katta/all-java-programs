package com.javaintroduction;

public class TestDemo05 {
	int squareNumber(int n) {
		return n*n;
	}

	public static void main(String[] args) {
    TestDemo05 t=new TestDemo05();
    int result = t.squareNumber(5);
    
    		System.out.println("result:"+result);
	}

}
