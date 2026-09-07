package com.arrays;

public class DiagonalSum {

	static int diagonalSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30 },
				        { 40, 50, 60 },
				        { 70, 80, 90 } };
		int result = diagonalSum(arr);

		System.out.println("diagonal sum: " + result);
	}

}
