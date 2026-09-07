package com.arrays;

public class TestDemo03 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int result = SumOfElements(arr);
		System.out.println("sum: " + result);

	}
	static int SumOfElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;

	}

}
