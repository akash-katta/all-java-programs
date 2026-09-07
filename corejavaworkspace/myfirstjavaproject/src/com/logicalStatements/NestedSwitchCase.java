package com.logicalStatements;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		System.out.println("vegetable/fruit market");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter category: ");
		String catg = sc.next();
        
		String yn1 = "";
		switch (catg) {
		case "vegetables" -> {
			do {
				System.out.println("enter the item");
				String item = sc.next();

				switch (item) {
				case "tmt" -> System.out.println("tomato - price : 50rs/kg ");
				case "ptt" -> System.out.println("potato - price : 40rs/kg");
				case "oni" -> System.out.println("Onion - Price: ₹35/kg");
				case "car" -> System.out.println("Carrot - Price: ₹60/kg");
				case "cab" -> System.out.println("Cabbage - Price: ₹30/kg");
				case "caf" -> System.out.println("Cauliflower - Price: ₹45/kg");
				case "bri" -> System.out.println("Brinjal - Price: ₹55/kg");
				case "bea" -> System.out.println("Beans - Price: ₹70/kg");
				default -> System.out.println("items not available");
				}
				System.out.println("do you want to continue press Y for yes and N for no");
				yn1=sc.next();
			}while(yn1.equalsIgnoreCase("y"));
		}
		case "fruits" -> {
			System.out.println("enter the fruit: ");
			String fruit = sc.next();
			
			switch(fruit) {
			case "app" -> System.out.println("Apple - Price: ₹180/kg");
		    case "ban" -> System.out.println("Banana - Price: ₹60/dozen");
		    case "man" -> System.out.println("Mango - Price: ₹120/kg");
		    case "org" -> System.out.println("Orange - Price: ₹100/kg");
		    case "grp" -> System.out.println("Grapes - Price: ₹90/kg");
		    case "pin" -> System.out.println("Pineapple - Price: ₹80/piece");
		    case "wat" -> System.out.println("Watermelon - Price: ₹35/kg");
		    case "pap" -> System.out.println("Papaya - Price: ₹50/kg");
			default -> System.out.println("items not available");
			}
			System.out.println("do you want to continue press Y for yes and N for no");

		}
		default -> System.out.println("entered category not available");
		}
	}

}
