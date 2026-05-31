package conditionalStatement;

import java.util.Scanner;

public class Positive_Negative_Zero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double number = sc.nextDouble();
		
		if(number >0) {
			System.out.println("It is a positive number");
		}
		else if(number <0) {
			System.out.println("It is a negative number");
		}
		else {
			System.out.println("It is zero");
		}
	}

}
