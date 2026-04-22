package com.java.core.Twoclass;

   public class Getusername{
	   
	public String getname(String fname , String lname ,int yob) {
		
		int year = yob % 100;
		
		String username = fname + lname + year;
		return username;
	}
	   
   }