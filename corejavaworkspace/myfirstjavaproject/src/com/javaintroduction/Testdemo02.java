package com.javaintroduction;

public class Testdemo02 {


		int a=10,b=20;
		float x=21.f,y=25.f;
		double p=30.,q=24.;
		void addition(){
			System.out.println("Addition="+(a+b));
			System.out.println("Addition="+(x+y));
			System.out.println("Addition="+(p+q));
		}
		
		
		public static void main(String[] args) {
			Testdemo02 sum = new Testdemo02();
			sum.addition();

		}

	}