package com.arrays;

public class TestDemo05 {

	public static void main(String[] args) {
    
		int[] arr = {10,20,30,40,50};
		
		int result = smalest(arr);
		
		System.out.println("largest number: "+ result);
		
	}
	
	static int smalest(int[] arr) {
		 int min = arr[0];
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]<min) {
				 min = arr[i];
			 }
		 }
		 return min;
	}

}
