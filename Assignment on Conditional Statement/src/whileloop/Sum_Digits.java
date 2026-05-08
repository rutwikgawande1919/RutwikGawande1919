package whileloop;

import java.util.Scanner;

public class Sum_Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int sum =0;
		int temp =Math.abs(num);
		
		while(temp>0) {
			
			int lastdigit = temp%10;
			
			sum +=lastdigit;
			
			temp = temp/10;
			
		}
		System.out.println("The sum of digits in "+num +"is "+sum);
		
	}

}
