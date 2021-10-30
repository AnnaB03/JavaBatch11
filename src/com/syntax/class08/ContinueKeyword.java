package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I want to print numbers from 1 to 10 except 3,7,9
		
		for (int i=1; i<=10; i++) { //outer loop always controls inner loop
			
			if (i==3 || i==7|| i==9) {
				continue;
			}
			System.out.println(i+ " ");
		}
		System.out.println("End of the code");

	}

}
