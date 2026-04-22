package com.java.core.Twoclass;

import java.util.Scanner;

public class Test1 {
       public static void main(String[] args) {
    	   
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.println("enter your first name");
    	   String fname = sc.next();
    	   
    	   System.out.println("enter your last name");
    	   String lname = sc.next();
    	   
    	   System.out.println("enter your yob");
    	   int yob = sc.nextInt();
    	   
	    Getusername name = new Getusername();
		String username =name.getname(fname , lname , yob);
		System.out.println("username is :" +username);
	}
}
