package loops;

import java.util.Scanner;

public class RaisToPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base number");
		int base = sc.nextInt();
		System.out.println("enter exponent number");
		int exponent = sc.nextInt();

		// Calculate power using Math.pow()
		double result = Math.pow(base, exponent);

		System.out.println(base + " raised to the power of " + exponent + " is: " + result);
	}
}
