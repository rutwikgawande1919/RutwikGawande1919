package conditionalStatement;

import java.util.Scanner;

public class PassFail_ResultChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks For Sub 1:");
         int sub1 = sc.nextInt();
         
        System.out.println("Enter Marks For Sub 2:");
         int sub2 = sc.nextInt();
        
        System.out.println("Enter Marks For Sub 3:");
         int sub3 = sc.nextInt();
         
         if(sub1 <33 || sub2 <33 || sub3 <33) {
        	 System.out.println("Fail");
         }
         else {
        	 System.out.println("pass");
         }	 

}
}