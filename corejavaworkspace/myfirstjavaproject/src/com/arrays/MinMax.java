package com.arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] arr = { 7, 8, 5, 4, 6, 9, 3 };

		int min = arr[0];
		int max = arr[0];

//    for(int a : arr) {
//    	if(a<min) {
//    		min = a;
//    	}else if(a>max){
//    		max=a;  		
//    	}
//    }

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("minimun number: " + min);
		System.out.println("maximum number: " + max);
	}

}
