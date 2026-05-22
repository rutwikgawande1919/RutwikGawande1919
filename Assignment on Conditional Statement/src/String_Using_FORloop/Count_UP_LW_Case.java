package String_Using_FORloop;

public class Count_UP_LW_Case {

	public static void main(String[] args) {
		
		String str = "RutwikGawande";
		
		int upcase=0;
		int lwcase =0;
		
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upcase++;
			}
			else if(Character.isLowerCase(ch)) {
				lwcase++;
			}
		}
			System.out.println("UpperCase is "+upcase);
			System.out.println("LowerCase is "+lwcase);

	}

}
