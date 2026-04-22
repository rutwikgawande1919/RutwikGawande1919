package com.java.core.Scanner;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("value of a is");
		int a = sc.nextInt();

		System.out.println("value of b is");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("addition is :" + sum);

		int sub = a - b;
		System.out.println("substraction is :" + sub);

	}

}
