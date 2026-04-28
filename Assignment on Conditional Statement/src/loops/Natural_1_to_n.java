package loops;

import java.util.Scanner;

public class Natural_1_to_n {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number (n)");
		int n = sc.nextInt();
		System.out.println("Natural numbers from 1 to" + n);
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
			
		}
	}

}
