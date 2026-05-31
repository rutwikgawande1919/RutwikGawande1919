package loops;

import java.util.Scanner;

public class Palindrome_Num {

	public static void main(String[] args) {
		 // Create a Scanner object for user input
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Store the original number to compare later
        int originalNum = num;
        int reversedNum = 0;
        
        // Loop to reverse the digits of the number
        while (num > 0) {
            int digit = num % 10;          // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num = num / 10;                // Remove the last digit from original
        }
        
        // Compare original and reversed values
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
        
        sc.close();
	}

}
