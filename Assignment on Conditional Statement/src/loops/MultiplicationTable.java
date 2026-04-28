package loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Print its Table");
		int num =sc.nextInt();
		System.out.println("Multiplication Table of" + num);
		
		for(int i =1; i <=10 ; i++) {
        System.out.println(num + "x" + i +  " = "  + (num * i));			
			
		}
	}

}
