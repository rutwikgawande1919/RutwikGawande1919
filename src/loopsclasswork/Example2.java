package loopsclasswork;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
// Q-: Print table by taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Table");
		int input = sc.nextInt();
		sc.close();
//Using For Loop.	
		for(int a=1; a<=10; a++) {
	System.out.println(input + "x" + a +"=" + input * a);
		}
		System.out.println("+++++++++++++++++");
//Using While Loop
		int b =1;
		while(b<=10) {
	System.out.println(input + "x" + b + "=" +input*b);
	b++;
		}
	}

}
