package com.java.core.Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
 /*When we write the for loop the outer execution,
  and the inner execution will be little bit different.
      
      *when we have to write the program 
      we will write on a screen it is called as outer execution.
      eg-:
      *1-:Declare + initialization
      *2-:Condition/Statement 
      *3-:Increment/Decrement
      *4-:print statement 
      *And we have to write the first three stage 
      in the parenthesis of for loop and print the statement
      in the for loop body. 
      */

		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println( +i);
		}
/*But when we run the code the code running process is 
 called as inner execution,and the sequence of inner execution 
 is little bit different from outer execution
 eg-:
      *1-:Declare + initialization
      *2-:Condition/Statement 
      *3-:print statement 
      *4-:Increment/Decrement
 */
		
	}

}
