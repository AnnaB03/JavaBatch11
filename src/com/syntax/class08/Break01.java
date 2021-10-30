package com.syntax.class08;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean summer = true;
		int temp =75;
		while (summer) {
			System.out.println("I am happy, I love summer");
			
			if (temp>=100) {
				System.out.println("I don't like the weather");
				break;
			}		
			temp+=5;
		}

	}

}
