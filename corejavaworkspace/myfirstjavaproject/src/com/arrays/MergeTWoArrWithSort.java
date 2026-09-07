package com.arrays;

import java.util.Arrays;

public class MergeTWoArrWithSort {

	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 7, 8, 10 };
		int[] arr2 = { 2, 3, 9 };

		int[] arr3 = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			arr3[arr1.length + j] = arr2[j];
		}

		// swaping
		int temp = 0;
		int count1 = 0;
		int count2 = 0;

		for (int j = 0; j < arr3.length - 1; j++) {
			count1++;
			boolean status = false;
			for (int i = 0; i < arr3.length - 1 - j; i++) {
				if (arr3[i] > arr3[i + 1]) {
					temp = arr3[i];
					arr3[i] = arr3[i + 1];
					arr3[i + 1] = temp;
					status = true;
				}
				count2++;
			}
			if (!status) {
				break;
			}

		}
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(Arrays.toString(arr3));
		

	}

}
