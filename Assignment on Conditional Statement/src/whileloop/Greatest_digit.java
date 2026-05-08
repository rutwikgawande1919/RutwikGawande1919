package whileloop;

import java.util.Scanner;

public class Greatest_digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt()); // Use Math.abs for negative numbers
        
        int maxDigit = 0; // To store the greatest digit

        // Use while loop to extract digits
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            
            if (digit > maxDigit) {
                maxDigit = digit; // Update if current digit is larger
            }
            
            num = num / 10; // Remove the last digit
        }

        System.out.println("The greatest digit is: " + maxDigit);
	}

}
