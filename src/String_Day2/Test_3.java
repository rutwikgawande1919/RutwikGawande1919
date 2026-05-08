package String_Day2;

import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {

		String username = "RutwikPatil";
		String password = "Rutwik123@";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Username");
		String usern = sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		sc.close();;
		
		if(username.equals(usern)) {
			
		}else {
			System.out.println(" invalid username");
		}
		if(password.equals(pass)) {
			
		}else {
			System.out.println(" invalid password");
		}
	}

}
