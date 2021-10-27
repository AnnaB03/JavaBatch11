package com.syntax.class7;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. print numbers from 1 to 100 in 1 line with space
		 * 2. print numbers from 100 to 1
		 * 3. Print even numbers from 20 to 1 (2 ways)
		 * 4.Print odd numbers between 20 and 50 (2 ways)
		  */
		
		for (int a=1; a<=100; a++) {
			System.out.print(" "+a+"");
		
		} 
		System.out.println();

		for (int a=100; a>=1; a--) {
			System.out.print(" "+a+" ");
		}
		
		System.out.println();
		
		for (int a=20; a>=1; a--) {
			if (a % 2 ==0) {
				System.out.print(" "+a+"");
			}
				}

		System.out.println();
		
		for (int a=20; a>=2; a-=2) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for (int a=20; a<=50; a++) {
			if (a % 2 !=0) {
				System.out.print(" "+a+"");
			}
		}
		
		System.out.println();
		
		for (int a = 21; a<=51; a+=2) {
			System.out.print(" "+a+"");
		}
		
	
	
		
		
		


	}

}
