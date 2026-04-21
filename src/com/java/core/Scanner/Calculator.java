package com.java.core.Scanner;

import java.util.Scanner;

public class Calculator {
 
	public static void main(String[] args) {
		
	Scanner sc	= new Scanner(System.in);
	
	System.out.println("enter value of a :");
		int a = sc.nextInt();
		
		System.out.println("enter value of b :");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("sum is :" +sum);
		
		int sub = a - b;
		System.out.println("sub is :" +sub);
		
	}
}
