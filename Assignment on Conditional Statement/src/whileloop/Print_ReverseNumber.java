package whileloop;

import java.util.Scanner;

public class Print_ReverseNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num which you want to reverse from");
		int a = s.nextInt();
		System.out.println("Reverse num from "+ a + " is");
		while(a>1) {
			System.out.println(a);
			a--;
		}
	}

}
