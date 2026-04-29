package loopsclasswork;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
//This while loop is always true		
		while(true) {
	System.out.println("Please enter a name");
	String name = sc.next();
	System.out.println("youe entered name" +name);	
		}
	}

}
