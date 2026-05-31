package loops;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int reversed = 0;

		// Loop until all digits are processed
		while (num != 0) {
			int digit = num % 10; // Extract the last digit
			reversed = reversed * 10 + digit; // Build the reversed number
			num /= 10; // Remove the last digit
		}

		System.out.println("Reversed Number: " + reversed);
		scanner.close();
	}

}
