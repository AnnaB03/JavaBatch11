package com.syntax.class7;

import java.util.Scanner;

public class HWPayForItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ask user what he/she wants to buy, ask for price and to pay for an item.
		 * continue asking to pay until user gets a right amount.
		 * conditions: 
		 * if user gives extra money --> give change
		 * if user gives less money --> ask how much more you need
		 * The amount has to be accumulated if users add more money
		 * Whenever a user is done with payments, tell them “Thank you for shopping!” 
		 */
	
		
		Scanner input = new Scanner(System.in);
		String item;
		int price;
		int money;
		int reminder;
		int sum=0;
		
		System.out.println("What item would you like to buy?");
		item = input.next();
		System.out.println("What is the price of the item?");
		price = input.nextInt();
		
		do {
		System.out.println("Please pay for the "+item);
		money = input.nextInt();
		sum+=money;
		
		if (sum>price) {
			
             int change = sum-price;
			System.out.println("Here is your change "+change);
			break;
		}else if (sum<price) {
			reminder = price-sum;
			System.out.println("Please give me more "+ reminder);
		}else {
			System.out.println("You got the right amount");
		} 
		
		} 
		
		while (sum!=price); 
		System.out.println("Thank you for shopping");
		
	}
}
		
		
		
		
	
		
		

	


