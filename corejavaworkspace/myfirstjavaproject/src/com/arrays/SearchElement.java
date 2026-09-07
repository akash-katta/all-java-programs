package com.arrays;

public class SearchElement {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, 
				        { 4, 5, 6 },
				        { 7, 8, 9 } };

		int search = 9;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == search) {
					System.out.println("element found");
					System.out.println("row: " + i);
					System.out.println("column: " + j);
				}
			}
		}
	}

}
