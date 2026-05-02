package conditionalStatement;

import java.util.Scanner;

public class LeapYearStatement {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a Year");
      int year = input.nextInt();
      
      boolean isleap = false;
      if(year % 4 == 0) {
    	   
    	  if(year % 100 == 0) {
    		  
    		  if(year % 400 == 0) {
    	         isleap = false;
      } else {
    	       isleap =true;
    	  
      } 
    	  } else {}
		  isleap = false;
      }
         if(isleap) {
        	 System.out.println("is a leap year");
         }
         else {
        	 System.out.println("is not a leap year");
         }
     
     
     
	}

}
