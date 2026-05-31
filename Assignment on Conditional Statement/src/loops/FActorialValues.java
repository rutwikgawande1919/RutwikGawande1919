package loops;

import java.util.Scanner;

public class FActorialValues {

	public static void main(String[] args) {
//step 1-> get input
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int num =sc.nextInt();
		
//step 2-> initialize result
		long factorial =1;

//step 3-> loop and multiply
		for(int a =1; a<=num; a++) {
		  factorial *=a;
			
		}
		System.out.println("factorial of num is :" +num );
		System.out.println(factorial);
	}

}
