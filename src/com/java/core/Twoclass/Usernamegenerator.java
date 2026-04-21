package com.java.core.Twoclass;

public class Usernamegenerator {
	
       public String getusername(String fname , String lname , int yob){
    	   
    	   //yob -> 1999/100  Q=19, R=99
    	  int year =  yob % 100;
    	   
    	   String username = fname + lname + year;
    	   return username;
    	   
    	   
    	   
       }
}
