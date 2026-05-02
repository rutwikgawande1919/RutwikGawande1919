package conditionalStatement;

import java.util.Scanner;

public class Ifconditionalstatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Input two integers
		System.out.print("Enter first value: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second value: ");
		int num2 = scanner.nextInt();

		// Determine larger and smaller
		int larger = Math.max(num1, num2);
		int smaller = Math.min(num1, num2);

		// Logic: Print larger if even, else print smaller
		if (larger % 2 == 0) {
			System.out.println("Result: " + larger);
		} else {
			System.out.println("Result: " + smaller);
		}

		
	}
}
