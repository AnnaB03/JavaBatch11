package com.syntac.class5;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that will ask user to input the current time (use 24 hour format).
		 * Based on the given time define:
		 * if hour is between 1-11 -- morning
		 * if hour is between 12-15 -- afternoon
		 * if hour is between 16-20 -- evening
		 * if hour is between 21-24 -- night
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter current time");
		int time=in.nextInt();
		
		if(time>=1 && time<=11) {
			System.out.println("it is morning");
		} else if(time>=12 && time<=15) {
			System.out.println("it is afternoon");
		} else if (time>=16 && time<=20) {
			System.out.println("it is evening");
		} else if (time>=21 && time<=24) {
			System.out.println("it is night");
		} else {
			System.out.println("not valid time entered");
		}
		
		System.out.println("************************");
		
		String timeOfDay;
		if(time>=1 && time<=11) {
			timeOfDay="morning";
		}else if(time>=12 && time<=15) {
			timeOfDay="afternoon";
		}else if(time>=16 && time<=20) {
			timeOfDay="evening";
		}else {
			timeOfDay="invalid";
		}
		
		System.out.println("right now is "+timeOfDay);

	}

}
