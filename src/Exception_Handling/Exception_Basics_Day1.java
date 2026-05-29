package Exception_Handling;

public class Exception_Basics_Day1 {

	public static void main(String[] args) {
	
		  System.out.println("Start");
		  String s= "Apple";
		  
		  for(int i =0;i<=s.length();i++) {
			  System.out.println(s.charAt(i));
		  }
		//code stop due to exception 
		//when exception occurs code flow breaks/code stop.
		//Further code do not executed  
		  System.out.println("End");
	}

}
