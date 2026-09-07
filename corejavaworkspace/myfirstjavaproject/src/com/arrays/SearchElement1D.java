package com.arrays;

public class SearchElement1D {

	public static void main(String[] args) {
 
		int[] arr= {10,20,30,40,50};
		
		int search = 20;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("element found:" +arr[i]);
			}
		}
	}

}
