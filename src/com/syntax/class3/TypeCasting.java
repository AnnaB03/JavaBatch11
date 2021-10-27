package com.syntax.class3;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number=10;//define
		int number2; //define
		number2=(int)number; //assigning to fit number into a small box
		System.out.println(number2);
		
		int number3=11;
		double number4=number3;
		int number5=1256;
		byte number6=(byte)number5;
		System.out.println(number6);
		
		short number7=12;
		byte number8=(byte)number7;
		
		int number9=10000;
		float f=number9;
		long l=(long)f;
		
		double number10=10.5;
		int number11=(int)number10;
		System.out.println(number11); 
		//->10.0 - we lost data 0.5

		/*
		 * byte-short-int-long-float-double ---- widening-small to big
		 * double-float-long-int-short-byte ---- narrowing-big to small
		 * 
		 */
		
	}

}
