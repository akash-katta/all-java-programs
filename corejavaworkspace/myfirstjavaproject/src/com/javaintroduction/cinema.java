package com.javaintroduction;

public class cinema {
	static int movieNo = 111;
	static String movieName = "rockstar";
	static String movieHero = "ranbir";
	
	
	String movieSinger = "mohith chouhan";
	String movieDirector = "imtiaz ali";
	public static void main(String[] args) {
		System.out.println(cinema.movieNo);
		System.out.println(cinema.movieName);
		System.out.println(cinema.movieHero);
		
		cinema TFI = new cinema();
		System.out.println(TFI.movieSinger);
		System.out.println(TFI.movieDirector);
		}
	
		

}
