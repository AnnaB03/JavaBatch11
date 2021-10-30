package com.syntax.class7;

public class HWSummOFEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculate sum of all even and all odd numbers from range 1 to 100
		
		
		int Osum=0;
		int Esum=0;
		
		for (int i=1; i<=100; i++) {
			if (i % 2==0) {
				Esum = Esum+i;
				
			}else {
				Osum+=i;
			}
		}
			System.out.println(" The Sum of all Even numbers up to 100 is "+ Esum);	
			System.out.println("The Sum of all Odd numbers up to 100 is "+Osum);
			
		
			

	}

}
