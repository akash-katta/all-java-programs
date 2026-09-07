package com.arrays;

public class TestDemo04 {

	public static void main(String[] args) {
  
		int[] arr = {10,20,30,40,50};
		
		int sum = sumOfElements(arr);
		System.out.println("sum: "+sum);
		
		int avg = sum/arr.length;
		
		System.out.println("avg: "+avg);
	}
	
	static int sumOfElements(int[] arr) {
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}

}
