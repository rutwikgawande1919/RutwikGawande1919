package OOps.Encapsulation;

public class Test_Facebook {

	public static void main(String[] args) {
		Facebook f = new Facebook();
		f.setUsername("Rutwik");
		String username =f.getUsername();
		System.out.println(username);
		
		
		f.setPassword("h74yhrh");
		String password = f.getPasword();
		System.out.println(password);
	}
}
