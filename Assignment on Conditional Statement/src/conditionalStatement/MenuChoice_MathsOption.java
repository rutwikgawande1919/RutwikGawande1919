package conditionalStatement;

import java.util.Scanner;

public class MenuChoice_MathsOption {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		double number1 = sc.nextDouble();
		System.out.println("Enter 2nd number");
		double number2 = sc.nextDouble();

		System.out.println("choice 1-:Add,choice 2-:substract,choice 3-:multiply,choice 4-:divide");
		System.out.println("Enter a choice");
		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Result: " + (number1 + number2));
		} else {
			if (choice == 2) {
				System.out.println("Result: " + (number1 - number2));
			} else {
				if (choice == 3) {
					System.out.println("Result: " + (number1 * number2));
				} else {
					if (choice == 4) {
						if (number2 != 0) {
							System.out.println("Result: " + (number1 / number2));
						} else {
							System.out.println("Error :cannot divided by zero");
						}
					} else {
						System.out.println("Invalid choice!");
					}
				}
			}
		}
	}
}