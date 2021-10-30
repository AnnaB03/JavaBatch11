package com.syntax.class08;

public class IfNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * nested loop -- loops inside another loop
		 */
		
		for (int i=1; i<=3; i++) { //outer loop
			System.out.println("I am an outer loop");
			for (int j=1; j<=4; j++) { //inner loop
				System.out.println("I am an inner loop");
				
			}
		}System.out.println("The end of the code");

	System.out.println("_____________________");
	
	for (int i=1; i<=3; i++) { //outer loop
		System.out.println(i);
		for (int j=1; j<=4; j++) { //inner loop
			System.out.println(i+" "+j);
			
		}
	}System.out.println("The end of the code");
	
	System.out.println("_____________________");

   
	
	for (int i=1; i<=9; i++) { //outer loop
	
	for (int j=0; j<=9; j++) { //inner loop
		System.out.println(i+" "+j);
		
	}
} System.out.println("The end of the code");

	}
}


