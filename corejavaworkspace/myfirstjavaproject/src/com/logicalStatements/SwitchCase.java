package com.logicalStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter jersy number: ");
    int jno = sc.nextInt();
    
    switch(jno) {
    case 7:
    	System.out.println("dhoni");
    	System.out.println("cool captain");  
    	break;
    case 18:
    	System.out.println("virat kohli");
    	System.out.println("king kohli");
    	break;
    case 45:
    	System.out.println("rohit sharma");
    	System.out.println("hitman");
    	break;
    default:
    	System.out.println("invalid jersey number");
    	System.out.println("details not found");
    }
	}

}
