package com.javaintroduction;

public class WrapperClsMethod {

	public static void main(String[] args) {
		//Integer.parseInt()
		//Double.parseDouble()
		//Boolean.parseBoolean()
		//Character.toString()
		String i1="100";
		int number=Integer.parseInt(i1);
		
		String i2="12.22";
		double decimal=Double.parseDouble(i2);
		
		String i3="true";
		boolean result = Boolean.parseBoolean(i3);
		
		char i4='A';
		String character = Character.toString(i4);
		
		
		
		System.out.println("number:"+number);
		System.out.println("decimal:"+decimal);
		System.out.println("result:"+result);
		System.out.println("character:"+character);
		
	}

}
