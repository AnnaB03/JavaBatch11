package com.syntac.class5;

import java.util.Scanner;

public class HWClass5 {

	
	public static void main(String[] args) {
		
		
             try (Scanner input = new Scanner(System.in)) {
				System.out.println("Please enter your birth month");
				 String month = input.nextLine();

String season = null;
if (month.equals("September") || month.equals("October") || month.equals("November")) {
				season="Fall";
} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
				season="Winter";
} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
				season="Spring";
} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
				season="Summer"; 


}
				
System.out.println("You were born in season "+ season);
			}
			
		}
	}




		


