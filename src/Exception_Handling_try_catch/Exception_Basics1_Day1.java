package Exception_Handling_try_catch;

public class Exception_Basics1_Day1 {

	public static void main(String[] args) {
		System.out.println("Starts");
		
		String s = "Apple";
		
		try {
			
			for(int i =0; i<=s.length();i++) {
				System.out.println(s.charAt(i));
			}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String value excedded :"+e);
		}
	
		System.out.println("End");
		
	}

}
