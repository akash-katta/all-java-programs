package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rotations ");
		int r = sc.nextInt();

		arrayRotation(arr, r);

		System.out.println("after rotation");
		System.out.println(Arrays.toString(arr));
	}

	static void arrayRotation(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;

		r = r % arr.length;
		
		// step-1:
		reverseArray(arr, start, end);

		// step-2:
		reverseArray(arr, start, r - 1);

		// step-3:
		reverseArray(arr, r, end);
	}

	static void reverseArray(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
