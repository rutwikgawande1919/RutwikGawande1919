package whileloop;

import java.util.Scanner;

public class Sum_of_Even1to_n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n");
		int n = sc.nextInt();
		sc.close();
		
		int sum =0;
		int i=2; 
		 while(i<=n) {
			sum +=i;
			 i +=2;
		 }
		
		System.out.println("sum of even between 1 to " +n + " is " +sum);
		
	}

}
