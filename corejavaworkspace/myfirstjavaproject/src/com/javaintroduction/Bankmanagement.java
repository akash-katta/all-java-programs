package com.javaintroduction;

public class Bankmanagement {
	static int accnt_number=1000;
	String customer_name;
    double bank_balance; 
    {
    	accnt_number++;
    }
    void display() {
    	System.out.println(accnt_number);
    	System.out.println(customer_name);
    	System.out.println(bank_balance);
    	System.out.println("********************");
    }
	
	public static void main(String[] args) {
		Bankmanagement b1=new Bankmanagement();
		b1.customer_name="nehal";
		b1.bank_balance=2045.96;
		b1.display();
		
		Bankmanagement b2=new Bankmanagement();
		b1.customer_name="arun";
		b1.bank_balance=4345.96;
		b1.display();
		
		
		Bankmanagement b3=new Bankmanagement();
		b1.customer_name="kalyan";
		b1.bank_balance=3145.96;
		b1.display();
		
		
		

	}

}
