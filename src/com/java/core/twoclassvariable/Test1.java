package com.java.core.twoclassvariable;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Student sc = new Student();

		sc.id = 101;
		sc.name = "Ram";
		sc.city = "pune";

		Student s1 = new Student();
		s1.id = 102;
		s1.name = "Sham";
		s1.city = "mumbai";

		System.out.println(sc.id);
		System.out.println(sc.name);
		System.out.println(sc.city);
		
		System.out.println("-------------------------------");

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.city);
	}

}
