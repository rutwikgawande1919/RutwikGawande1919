package String_Day1;

public class StringTest {

	public static void main(String[] args) {

		String day = "TUESDAY";
	
//This method take out length if the value		
		    int length = day.length();
		    System.out.println(length);

//This method take out on second number our which character are present 		    
		    char a = day.charAt(2);
		   	System.out.println(a);

//This method convert our Uppercase value in Lowercase		   	
		   	String daylower = day.toLowerCase();
		   	System.out.println(daylower);

//This method converts Lowercase value in Uppercase		   	
		   	String dayupper = daylower.toUpperCase();
		   	System.out.println(dayupper);
		 
//This method shows in our value 'D' present or not 		   	
		   	boolean abc = day.contains("D");
		   	System.out.println(abc);
		   
//With the help of this method In our value we can able to add some another numbers and letters		   	
		   	String y = day.concat(" ABC");
		   	System.out.println(y);
	}

}
