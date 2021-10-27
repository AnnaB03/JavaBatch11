package com.syntax.class3;

public class IfConditionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=50;
		if(temp>=60)  {
			System.out.println("I am going to beach");
		}else {
			System.out.println("I will go for a walk");
			
		}
		
		String userName="Aysha";

		if(userName.equals("Hormat")) {
			System.out.println("Hi Hormat");
		}
		
		else {
			System.out.println("I don't know you");
		}
		
		
		
		if(userName !="Hormat") {
			
		//for Strings only == and != are allowed
			// but not recommended to use
			//always use /equals("")
			System.out.println("Hi Hormat");
		}else {
			System.out.println("I don't know you");
		}
	}

}
