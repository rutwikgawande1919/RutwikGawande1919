package StringClassMethods;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		
		String username ="RutwikPatil123@gmail.com";
		String password ="Rutwik123@";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a username");
		String usern = sc.next();
		System.out.println("enter a password");
		String pass = sc.next();
		
		
		if(username.equalsIgnoreCase(usern)) {
			
		}else {
			System.out.println("code is invalid");
		}
		if(password==pass) {
			
		}
		else {
			System.out.println("lets see");
		}
		

	}

}
