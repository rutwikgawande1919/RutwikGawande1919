package whileloop;

import java.util.Scanner;

public class Print_n_EvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n");
		int n = sc.nextInt();
		
		int a = 0;
		int num = 0;
		while (a<=n) {
			System.out.println(num);
			num+=2;
			a++;
		}
	}

}
