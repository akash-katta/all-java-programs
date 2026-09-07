package com.arrays;

public class StringNames {

	public static void main(String[] args) {
    String[] names = new String[5];
    
    names[0] = "akash";
    names[1] = "akash";
    names[2] = "akash";
    names[3] = "akash";
    names[4] = "akash";
    
//    for(String name:names) {
//    	System.out.println(name);
//    }
    for(int i = 0; i < names.length; i++) {
    	System.out.println(names[i]);
    }

	}

}
