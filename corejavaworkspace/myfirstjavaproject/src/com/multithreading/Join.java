package com.multithreading;

class Join1 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println("j1: " + i);
			sum = sum + i;
		}
		System.out.println("sum of j1: " + sum);
	}
}

class Join2 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println("j2: " + i);
			sum = sum + i;
		}
		System.out.println("sum of j2: " + sum);
	}
}

class Join3 extends Thread {
	Join2 t2;
	Join3(Join2 t2){
		this.t2=t2;
	}
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			
			if(i == 125) {
				try {
					t2.join();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("j3: " + i);
			sum = sum + i;
		}
		System.out.println("sum of j3: " + sum);
	}
}

public class Join {

	public static void main(String[] args) {

		Join1 j1 = new Join1();
		Join2 j2 = new Join2();
		Join3 j3 = new Join3(j2);
		
		j1.start();
		j2.start();
		j3.start();
	}

}
