package whileloop;

import java.util.Scanner;

public class Print_n_NaturalNUmber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		
		int a = 1;
		
		while (a<=n) {
			System.out.println(a);
			a++;
		}
		
		
		
	}

}
