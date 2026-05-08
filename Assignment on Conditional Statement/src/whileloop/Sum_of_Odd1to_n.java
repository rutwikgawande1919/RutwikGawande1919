package whileloop;

import java.util.Scanner;

public class Sum_of_Odd1to_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n");
		int n = sc.nextInt();
		sc.close();
		
		int sum =0;
		int i =1;
		
		while(i<=n) {
			sum +=i;
			i+=2;
		}
		System.out.println("sum of odd num 1 to " +n+ " is " +sum);
	}

}
