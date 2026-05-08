package whileloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num to count its factorial");
		int num = sc.nextInt();
		
		long factorial =1;
		int i =1;
		
		if(num<0) {
			System.out.println("Factorial is not definrd for a negative number");
		}else {
		while (i<=num) {
			
			factorial *= i;
			i++;
		}
		System.out.println("The factorial of "+num+" is "+factorial);
	}

}
}