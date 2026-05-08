package whileloop;

import java.util.Scanner;

public class Digit_Counter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long num = sc.nextLong();
		sc.close();
		
		int count =0;
		long temp = Math.abs(num);
		
		if(temp==0) {
			count =1;
		}else {
			while(temp!=0){
				temp /=10;
				count ++;
			}
		}
		    System.out.println("The num of digit is " +count);
	}

}
