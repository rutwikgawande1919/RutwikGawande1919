package com.java.core.Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
     
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a input");
		 int number = input.nextInt();
		
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println( +i);
			
		}
	}

}
