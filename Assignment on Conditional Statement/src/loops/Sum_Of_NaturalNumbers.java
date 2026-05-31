package loops;

import java.util.Scanner;

public class Sum_Of_NaturalNumbers {

	public static void main(String[] args) {

		System.out.println("Enter a possitive intiger (n)");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int sum =0;
		for (int a=1; a<=n;a++) {
			sum += a;
		}
		System.out.println(n);
		sc.close();
	}

}
