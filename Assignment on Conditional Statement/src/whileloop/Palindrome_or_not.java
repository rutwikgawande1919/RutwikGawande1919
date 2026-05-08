package whileloop;

import java.util.Scanner;

public class Palindrome_or_not {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int originalnumber = num;
		int reversenum= 0;
		
		while (num != 0) {
			int reminder = num%10;
			reversenum = reversenum*10 + reminder;
			num= num /10;
		}
	
		if(originalnumber == reversenum) {
			System.out.println(originalnumber +" it is a palindrome");
		}else {
			System.out.println(originalnumber +" it is not a palindrome");
		}
	}

}
