package com.java.core.twoclassvariable;

public class Test {

	public static void main(String[] args) {
		 
		Student st = new Student();
		st.id = 101;
		st.name = "Ram";
		st.city = "pune";

		Student s1 = new Student();
		s1.id = 102;
		s1.name = "Sham";
		s1.city = "pune";

		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.city);
		System.out.println("------------------------------------");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.city);

	}

}
