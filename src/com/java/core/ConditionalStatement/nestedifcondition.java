package com.java.core.ConditionalStatement;

public class nestedifcondition {

	public static void main(String[] args) {
		int a = 12;
	
       
		if (a % 2 == 0) {
			
			System.out.println("It is even number");
		
		 if (a % 3 == 0) {
			System.out.println("it is a good number ");
		}
		 
		}
		else {
			System.out.println("it is a bad number");
	}	
}
}