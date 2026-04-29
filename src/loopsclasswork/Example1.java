package loopsclasswork;

public class Example1 {

	public static void main(String[] args) {
// Q-:Find even numbers from 1 to 30.
		
  //Using for loop
		for(int a=1; a<=30; a++) {
			
		if(a%2==0) {
			System.out.println(a);
		}	
			
		}
System.out.println("--------------------------------------");
  // Using while loop
        int a =1;
        while(a<=30) {
        	
        if(a%2==0) {
        	System.out.println(a);
        }	
        a++;
        }
	}

}
