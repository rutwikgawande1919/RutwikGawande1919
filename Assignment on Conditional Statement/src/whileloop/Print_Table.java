package whileloop;

import java.util.Scanner;

public class Print_Table {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num for a Table");
		int num= s.nextInt();
		System.out.println("Table of " + num +" is");
		int b=1;
		while (b <= 10) {
			System.out.println(num + "x" + b + "=" + (num * b));
			b++;
		}
	}

}
