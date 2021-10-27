package com.syntax.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a Java program and name it Temperature Check. 
		 * Create variable to store temperature. 
		 * Your program should check if temperature is below 32 then it should print 
		 * “Water will freeze with temperature __”, 
		 * otherwise “Water will NOT freeze with temperature __”.
		 */

		double temperature=36;
		
		if(temperature<32)
		{
			System.out.println("Water will freeze with temperature "+ temperature);
			
			} else {
				
		System.out.println("Water will NOT freeze with temperature "+ temperature);
		}
			
	}
				
}
