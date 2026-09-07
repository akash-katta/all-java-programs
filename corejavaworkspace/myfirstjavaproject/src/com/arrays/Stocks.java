package com.arrays;

public class Stocks {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 5, 3, 2, 4, 6 };

		int minProfit = arr[0];
		int maxProfit = 0;
		int sellPrice = 0;
		int buyPrice = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minProfit) {
				minProfit = arr[i];

			}
			int profit = arr[i] - minProfit;

			if (profit > maxProfit) {
				maxProfit = profit;
				buyPrice = minProfit;
				sellPrice = arr[i];
			}
		}

		System.out.println("minProfit: " + minProfit);
		System.out.println("maxProfit: " + maxProfit);
		System.out.println("buyPrice: " + buyPrice);
		System.out.println("sellPrice: " + sellPrice);
		

	}

}
