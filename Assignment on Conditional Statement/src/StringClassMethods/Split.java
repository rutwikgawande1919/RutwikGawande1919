package StringClassMethods;

public class Split {

	public static void main(String[] args) {
	
		String str = "a,b,c";
		String[] parts = str.split(",");
		
		for(String s:parts) {
			System.out.println(s);
		}
	}

}
