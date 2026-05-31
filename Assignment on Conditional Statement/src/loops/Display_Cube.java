package loops;

import java.util.Scanner;

public class Display_Cube {

	public static void main(String[] args) {
		 // Create scanner to read input from console
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number of terms : ");
        int n = sc.nextInt();
        
        // Loop from 1 to n to calculate and print cubes
        for (int i = 1; i <= n; i++) {
            // Cube is calculated by multiplying the number by itself three times
            int cube = i * i * i;
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + cube);
        }
        
        sc.close();
	}

}
