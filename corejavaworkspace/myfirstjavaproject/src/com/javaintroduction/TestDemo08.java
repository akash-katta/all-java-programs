package com.javaintroduction;

public class TestDemo08 {
  double balance = 100000.00;
   
  void checkbanlance() {
	  System.out.println("current balance:"+balance);
  }
  void deposite(double amount) {
	  balance = balance + amount;
	  System.out.println("deposite:"+amount);
  }
	public static void main(String[] args) {
		TestDemo08 sbi = new TestDemo08();
		sbi.checkbanlance();
		sbi.deposite(3000);
		sbi.checkbanlance();

	}

}
