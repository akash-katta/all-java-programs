package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 8, 3, 2 };
		int temp = 0;

		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
//		int count = 0;
//		int count1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
//			count++;
//			boolean status = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
//					status = true;
				}
//				count1++;
			}
//			if (!status) {
//				break;
//			}
		}
//		System.out.println(count);
//		System.out.println(count1);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(arr));

	}

}
