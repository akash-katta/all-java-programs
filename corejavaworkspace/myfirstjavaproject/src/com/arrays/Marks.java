package com.arrays;

public class Marks {

	public static void main(String[] args) {
		int[] marks = { 99, 98, 97, 96, 95, 94 };

		int total_marks = 0;
		int avg = 0;

		for (int m : marks) {			
			total_marks = total_marks + m;			
		}
		avg = total_marks/marks.length;
		System.out.println("total marks: "+ total_marks);
		System.out.println("avg marks: "+ avg);
	}

}
