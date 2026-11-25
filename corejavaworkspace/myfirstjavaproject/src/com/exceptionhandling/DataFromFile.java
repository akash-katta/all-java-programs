package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DataFromFile {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\aksha\\FileIO\\akash21.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
		System.out.println("");
		System.out.println("main method ended");

	}

}
