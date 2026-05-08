package whileloop;

import java.util.Scanner;

public class product_of_digit {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        
	        // Handle negative numbers and zero
	        int n = Math.abs(num);
	        int product = (n == 0) ? 0 : 1; 

	        while (n > 0) {
	            int digit = n % 10;     // Get the last digit (e.g., 123 % 10 = 3)
	            product *= digit;       // Multiply current product by the digit
	            n /= 10;                // Remove the last digit (e.g., 123 / 10 = 12)
	        }

	        System.out.println("Product of digits: " + product);
	}

}
