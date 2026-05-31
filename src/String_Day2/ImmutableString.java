package String_Day2;

public class ImmutableString {

	public static void main(String[] args) {
//Immutable meaning -> once created cannot be change		

		String pwd = "Friday.1234";//it stores in (scp)string constant pool
		String pwd1 = "FRIDAY.123";// it is also stores in scp
		
/*Lets check using identityHashcode our existing value means data memory location
   are changed or not
 *if our existing string/value memory location or compared string/value memory location 
 changed then our string/value will be immutable/irreplaceable    
   */		
System.out.println("pwd-friday.123: memory location is "+System.identityHashCode(pwd));
System.out.println("pwd1-FRIDAY.123: memory location is "+System.identityHashCode(pwd1));
System.out.println(" existing String/value is immutable/not changable");
	}

}
