package com.syntac.class5;

import java.util.Scanner;

public class LogicalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter number #1");
		int num1=input.nextInt();
		System.out.println("Please enter number #2");
		int num2=input.nextInt();
		System.out.println("Please enter number #3");
		int num3=input.nextInt();
		
		if (num1==num2 && num1==num3) {
			System.out.println("Numbers are equal");
		} else {
		
		if (num1>=num2&&num1>num3) {
			System.out.println("#1 is the largest");
			if(num1%2==0) {
				System.out.println(num1+ " is an even number");
			}else {
				System.out.println(num1+" is an odd number");
			}
			
		} else if(num2>=num1&&num2>=num3) {
			System.out.println("#2 is the largest");
		} else if(num3>num2&&num3>=num1) {
			System.out.println("#3 is the largest");
		} 
	
		
		
		
		
	}

}
}