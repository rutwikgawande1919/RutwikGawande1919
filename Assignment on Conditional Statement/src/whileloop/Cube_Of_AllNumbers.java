package whileloop;

import java.util.Scanner;

public class Cube_Of_AllNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num for a cube");
		int num =sc.nextInt();
		
		int a = 1;
		
		while ( a <= num) {
			int cube = a * a * a;
			System.out.println("cube of "+a+ "is "+ cube);
			a++;
		}
	}

}
