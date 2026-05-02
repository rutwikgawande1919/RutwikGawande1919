package com.java.core.StaticKeyword;

public class TestStatic {

	public static void main(String[] args) {

		Student s = new Student();
/* but when we Declare(class load) and Initialize(create object) simultaneously
  then static and non static variable/method load simultaneously */		

		Student st;
// declare -> class loaded -> only static methods are loaded
		st = new Student();
// initialize -> object created -> only non static methods are loaded
		System.out.println(s.city);

		System.out.println(Student.name);

	}

}
