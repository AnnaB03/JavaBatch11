package com.syntac.class5;

import java.util.Scanner;

public class LogocalOrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter today's day");
		
		String day=scan.next();
		
		if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("friday"))
		
		{ System.out.println("no class");
			
		} else if(day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday"))
			
		{
			System.out.println("We have manual class today");
			
		}else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday"))
		{
			System.out.println("We have Java class today");
			
		}else if (day.equalsIgnoreCase("Thursday"))
		{
			System.out.println("We have review class");}
		
		else {
			System.out.println("Wrong input");
		}
		
		
		}

	}


