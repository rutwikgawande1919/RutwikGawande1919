package String_Using_FORloop;

public class CountSpaces {

	public static void main(String[] args) {

		String str ="Rutwik is a bad boy";
		int spacecount = 0;
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				spacecount++;
			}
			
		}
		System.out.println("Spaces are "+spacecount);
	}

}
