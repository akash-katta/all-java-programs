package com.exceptionhandling;
import java.io.File;
import java.io.IOException;

//IO exception occurs when the path is not specified
public class FileIO {

	public static void main(String[] args) throws IOException {
		System.out.println("mian method started");

		File f = new File("d:\\Users\\aksha\\FileIO\\akash21.txt");
		
		f.createNewFile();
		System.out.println("main method ended");
	}

}
