package OOps.Encapsulation;

public class Test_Gmail {

	public static void main(String[] args) {

		Gmail g =new Gmail();
		
		g.setUsername("Apple");
		String username = g.getUsername();
		System.out.println(username);
	}

}
