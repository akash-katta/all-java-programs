package com.javaintroduction;

public class Chocolateshop {
	static int price = 18;
	static int money = 360;

	public static void main(String[] args) {
		int noffreec = 5;
        int nofchoc = money / price;
        int setchoco = nofchoc / noffreec;
        int totalchocos=nofchoc+setchoco;
		System.out.println("price:"+price);
		System.out.println("money:"+ money);
		System.out.println("noffreec:"+ noffreec);
		System.out.println("nofchoc:"+ nofchoc);
		System.out.println("setchoco:"+ setchoco);
		System.out.println("totalchocos:"+ totalchocos);
	
	}

}
