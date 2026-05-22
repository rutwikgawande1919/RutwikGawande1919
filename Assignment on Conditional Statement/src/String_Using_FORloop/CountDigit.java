package String_Using_FORloop;

public class CountDigit {

	public static void main(String[] args) {

		String str ="Hello123World45";
		int count =0;
		
		for(int i =0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				
				count++;
			}
		}
		
		System.out.println("Number of digits "+count);
	}

}
