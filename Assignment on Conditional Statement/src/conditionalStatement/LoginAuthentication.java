package conditionalStatement;

import java.util.Scanner;

public class LoginAuthentication {

	public static void main(String[] args) {
		String username = "RutwikGawande123";
		String password = "Patil1919";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a username");
		String user = sc.next();
		System.out.println("Enter a password");
		String pass = sc.next();

		if (username.equals(user)) {
			System.out.println("Access Granted");

			
		} 
		 if (password.equals(pass)) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("  Access Denied");

		}
		
	}
	
	}


