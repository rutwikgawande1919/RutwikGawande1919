package OOps.Encapsulation;

public class Test_Instagram {

	public static void main(String[] args) {

		Instagram i = new Instagram();
		i.setUsername("apple");
		String username =i.getUsername();
		System.out.println(username);
		
		
		
		i.setPassword("xyz");
		String password =i.getPassword();
		System.out.println(password);
		
	}

}
