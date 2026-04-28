package loops;

import java.util.Scanner;

public class ReverseMultiplicationTable {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number to print its Table");
	int num = sc.nextInt();
	System.out.println("Multiplication table of :" + num);
	
	for(int i =10; i >=1; i-- ) {
		System.out.println(num + "x" + i + " = " +(num*i) );
	}
	
	}

}
