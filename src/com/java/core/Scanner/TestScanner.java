package com.java.core.Scanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
    	   //Take input from console to jsvs file
		Scanner sc = new Scanner(System.in);
		
	// 1. int as a yob	
	System.out.println("please enter your year of birth :");
	int yob = sc.nextInt();
	System.out.println("year of birth is :" +yob);
	
	// 2. String as a name
	System.out.println("please enter your city name please :");
	String city = sc.next();
	System.out.println("your city name is :" +city);
		
	}
}
