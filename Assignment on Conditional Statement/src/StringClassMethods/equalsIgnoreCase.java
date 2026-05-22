package StringClassMethods;

import java.util.Scanner;

public class equalsIgnoreCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name =sc.next();
		
		
		String originalname = "hello world";
		
/*equalsIgnoreCase-:method ignore uppercase or lowercase
its only check the spelling of the value and print it */
		if(originalname.equalsIgnoreCase(name)) {
			
			
		}else {
			System.out.println("It is a valid name");
		}
		
	}

}
