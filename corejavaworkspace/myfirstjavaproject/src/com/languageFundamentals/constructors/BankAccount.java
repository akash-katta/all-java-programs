package com.languageFundamentals.constructors;

public class BankAccount {
	int accntNumber;
	String holderName;
	double balance;
	
	BankAccount(int accntNumber ,String holderName ,double balance){
		this.accntNumber=accntNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
//	 copy constructor
	BankAccount(BankAccount b2){
		this.accntNumber=b2.accntNumber;
		this.holderName=b2.holderName;
		this.balance=b2.balance;
		
	}
	 void diplay() {
	 System.out.println("accntNumber:"+accntNumber);
	 System.out.println("holderName:"+holderName);
	 System.out.println("balance:"+balance);
	 }
	 void deposit(double amount) {
		 balance=balance+amount;
	 }
	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount(955,"akash",1500.00);		
		BankAccount b2 = new BankAccount(b1);
		BankAccount b3 = new BankAccount(b2);

		
		b2.deposit(500);
		
		
		System.out.println("*****************original amount******************");
		b1.diplay();
        System.out.println("*****************copied***************************");
    	b2.diplay();
    	
    	b2.deposit(500);
        System.out.println("*****************copied***************************");
        b3.diplay();
   
	}

}
