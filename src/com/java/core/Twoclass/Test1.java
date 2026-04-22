package com.java.core.Twoclass;

public class Test1 {
       public static void main(String[] args) {
		Getusername name = new Getusername();
		String username =name.getname("rutwik" , "gawande" , 1999);
		System.out.println("username is :" +username);
	}
}
