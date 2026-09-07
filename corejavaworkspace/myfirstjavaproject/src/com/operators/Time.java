package com.operators;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter total seconds: ");
		int totalSeconds= sc.nextInt();
		
		int hours = totalSeconds/3600;
		int remainingSeconds = totalSeconds % 3600;
		
		int minutes = remainingSeconds / 60;
		int seconds = remainingSeconds % 60;
		
		System.out.println("hours: "+ hours);
		System.out.println("minutes:"+ minutes);
		System.out.println("seconds:"+ seconds);
	}

}
