package com.syntac.class5;

import java.util.Scanner;

public class highLogicalAndOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * Prompt the user to enter person heights in inches. 
	 * Person should be classified as one of the following:
	 * short (under 60 inch)
	 * medium(between 60 -72 inch)
	 * tall (over 72 inch)
	 *
	 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is your hight in inches?");
		
		int num=input.nextInt();
		
		if(num<60) {
			
			System.out.println(" you are short");
			
		}else if(num>=60&&num<72) {
			System.out.println(" you are medium");
		
	} else if(num>72) {
		
	System.out.println(" you are tall");
	}
		}
		}


