package whileloop;

public class Divisible_by_5 {

	public static void main(String[] args) {

		int a =1;
		while(a<=100) {
			if(a % 5==0) {
				System.out.println(a);
			}
			a++;
		}
	}

}
