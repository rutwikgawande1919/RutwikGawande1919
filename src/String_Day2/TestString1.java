package String_Day2;

import java.util.Scanner;

public class TestString1 {

	public static void main(String[] args) {

		String username = "Rutwik";
		String password = "Rutwik123";  
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Username");
		String user = sc.next();
		System.out.println("Enter a Password");
		String pass = sc.next();
		sc.close();;
		
		if (username.equals(user)) {
			
		} else {
			System.out.println("invalid username");
		}
			
		if(password.equals(pass)) {
			
		}else {
			System.out.println("invalid password");
		}
			
		
		
		
	
	}

}
