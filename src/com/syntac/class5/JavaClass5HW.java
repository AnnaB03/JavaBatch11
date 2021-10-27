package com.syntac.class5;

import java.util.Scanner;

public class JavaClass5HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		 * if the average score >=90 grade=A
		 * if the average score >= 70 and <90  grade=B
		 * if the average score>=50 and <70  grade=C
		 * if the average score<50  grade=F
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your quiz results, mid term results and final score");
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int average = (num1+num2+num3)/3;
		
		String grade = null;
		if (average>=90) {
			grade="A";
		}else if(average>=70&&average<89) {
			grade="B";
		}else if(average>=50&&average<70) {
			grade="C";
		}else if(average<50) {
			grade="F";
		}
		System.out.println("Your grade is "+grade);
		

	}

}
