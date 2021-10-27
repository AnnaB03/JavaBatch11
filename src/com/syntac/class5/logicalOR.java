package com.syntac.class5;

import java.util.Scanner;

public class logicalOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		
		String answer=input.next();
		
		if(answer.equals("yes") || answer.equals("yep")|| answer.equals("yeah")) {
		
		System.out.println("Please tell me the balance");
		}
		
		
		
		
	}

}
