package com.arrays;

public class TestDemo06 {

	public static void main(String[] args) {

		int[] arr = { 30, 20, 10, 40, 50 };

		int second = secondLargest(arr);
		System.out.println("second largest: " + second);
	}
	
	static int secondLargest(int[] arr) {
		int largest = arr[0];
		int second = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second=largest;
				largest=arr[i];
			}else if(arr[i]>second && arr[i]!=largest) {
				second=arr[i];
			}
		}
		return second;
		
	}

}
