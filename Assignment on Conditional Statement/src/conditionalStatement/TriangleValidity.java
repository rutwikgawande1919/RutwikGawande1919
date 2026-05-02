package conditionalStatement;
import java.util.Scanner;
public class TriangleValidity {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        // Input three angles
	        System.out.println("Enter three angles of the triangle:");
	        int angle1 = input.nextInt();
	        int angle2 = input.nextInt();
	        int angle3 = input.nextInt();

	        // Check validity criteria
	        if ((angle1 + angle2 + angle3 == 180) ) {
	            System.out.println("The angles form a valid triangle.");
	        } else {
	            System.out.println("The angles do NOT form a valid triangle.");
	        }
	        
	}

}
