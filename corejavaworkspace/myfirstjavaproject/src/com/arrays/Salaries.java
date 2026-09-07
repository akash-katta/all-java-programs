package com.arrays;

public class Salaries {

	public static void main(String[] args) {

		double[] salaries = new double[5];

//    for(double sal:salaries) {
//    	System.out.println(sal);
//    }

		salaries[0] = 600000.00;
		salaries[1] = 300000.00;
		salaries[2] = 200000.00;
		salaries[3] = 100000.00;
		salaries[4] = 500000.00;

		for (int i = 0; i < salaries.length; i++) {
        if(salaries[i]>400000.00) {
        	System.out.println(salaries[i]);
        }
		}
	}

}
