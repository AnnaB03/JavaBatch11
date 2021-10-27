package com.syntax.class7;

public class HWSummOFEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculate sum of all even and all odd numbers from range 1 to 100
		
		
		int sum=0;
		for (int i=2; i<=100; i+=2) {
			if (i % 2==0) {
				sum = sum+i;
				
			}
		}
			System.out.println(" The Sum of all Even numbers up to 100 is "+ sum);	
			
		
			

	}

}
