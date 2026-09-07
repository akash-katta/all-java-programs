package com.arrays;

public class Ages {

	public static void main(String[] args) {

		// step 1:declaration
		int[] ages;

		// step 2:creation
		ages = new int[10];

		// step 3:initialisation
		ages[0] = 22;
		ages[1] = 22;
		ages[2] = 22;
		ages[3] = 22;
		ages[4] = 22;
		ages[5] = 22;
		ages[6] = 22;
		ages[7] = 22;
		ages[8] = 22;
		ages[9] = 22;

		// step 4: represention
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//	}
	    //for each loop
		for(int age:ages) {
			System.out.println(age);
		}
		}
	}


