package conditionalStatement;

import java.util.Scanner;

public class AgeCategoryChecker {

	public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter Age");
      int age = sc.nextInt();
      
      if(age <=0) {
    	  System.out.println("Invalid numer entered");
    	  
    	  
      } else if(age <=13) {
    	  System.out.println("category:Child");
    	 
      }else if (age <=18) {
    	  System.out.println("category:Teen");
    	  
      }else if (age <=60) {
    	  System.out.println("category:Adult");
     	 
      }else if(age <=100) {
    	  System.out.println("category:Senior");
    	  
      }else {
    	  System.out.println("Enter numeric age");
    	  
      }
	}

}
