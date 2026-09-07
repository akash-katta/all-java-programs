package com.arrays;

public class TestDemo01 {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 8, 9, 7, 4 };

//    for(int a : arr) {
//    	System.out.println(a);   	
//    }
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
