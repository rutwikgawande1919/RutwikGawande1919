package com.java.core.Twoclass;

public class Test { 
	
	//Requirement -> fname = john , lname = wick , yob =1999
	// username -> johnwick99
	
	public static void main(String[] args) {
		Usernamegenerator generator = new Usernamegenerator();
	String username	= generator.getusername("john" , "wick" , 1999);
	System.out.println("username is :" + username);
	}

}
