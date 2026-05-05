package whileloop;

public class Print_EvenNumbers {

	public static void main(String[] args) {

		int a=1;
		while(a<50) {
			
			if(a%2==0) {
				System.out.println("The even num is " +a);
			}
			a++;
		}
	}

}
