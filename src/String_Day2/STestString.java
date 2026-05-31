package String_Day2;


public class STestString {

	public static void main(String[] args) {

		
		String s = "Rutwik";
		
		for(int a =0; a<=s.length()-1; a++) {
			System.out.println(s.charAt(a));
			
		}
		System.out.println("==================================");
		for(int a =s.length()-1; a>=0;a--) {
			System.out.println(s.charAt(a));
		}
	}

}
