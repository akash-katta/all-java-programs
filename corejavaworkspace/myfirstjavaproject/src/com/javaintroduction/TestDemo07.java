package com.javaintroduction;


public class TestDemo07 {
    
	void addition(int a,int b) {
	System.out.println("----------addition called------------");
	int add=a+b;
	System.out.println("addition:"+add);
}
    
	void subtraction(float a , double b) {
		System.out.println("------------subtraction called---------");
		double diff=a-b;
		System.out.println("subtraction:"+diff);
	}
	
	void multiplication(byte a,short b,int c,long d,float e,double f) {
		System.out.println("------------multiplication called---------");	
		double multiply=a*b*c*d*e*f;
		System.out.println("multiplication:"+multiply);
	}
	
	void division(double d,double d1) {
		System.out.println("------------division called---------");	
        double divide=d/d1;
        System.out.println("division:"+divide);
	};

     void reminder(double d,int i) {
    	 System.out.println("-----------remainder--------------");
         double reaminder=d%i;
         System.out.println("remainder:"+reaminder);
     }
     
     
	
	
	public static void main(String[] args) {
		TestDemo07 t1 = new TestDemo07();
		t1.addition(33, 44);
		t1.subtraction(500,400);
		t1.multiplication((byte)120, (short)545, 4887198, 5118919, 19854651.55f, 15651.654);
        t1.division(97,7);
        t1.reminder(97,7);
	}

}
