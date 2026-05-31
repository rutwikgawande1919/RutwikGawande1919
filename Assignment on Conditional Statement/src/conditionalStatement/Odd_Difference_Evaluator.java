package conditionalStatement;

public class Odd_Difference_Evaluator {

	public static void main(String[] args) {

		
		int num1= 3;
		int num2 = 9;
		if (num1 % 2 != 0 && num2 % 2 != 0) {
            // Print absolute difference
            System.out.println(Math.abs(num1 - num2));
        } else {
            // Print "Invalid" if at least one is even
            System.out.println("Invalid");
        }
	}

}
