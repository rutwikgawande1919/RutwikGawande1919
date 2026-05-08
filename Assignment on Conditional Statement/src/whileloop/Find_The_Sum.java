package whileloop;

import java.util.Scanner;

public class Find_The_Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive intiger n");
		int n = sc.nextInt();
		
		
		 int sum = 0; // Accumulator for the total sum
	        int i = 1;   // Counter starting from 1
	        
	        // Loop runs from 1 up to and including n
	        while (i <= n) {
	            sum += i; // Add current value of i to sum
	            i++;      // Increment counter to move to the next number
	        }
	        
	        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
	        
	        sc.close();
	}

}
