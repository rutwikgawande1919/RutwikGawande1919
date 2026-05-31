package Super_this_keyword;

public class HR extends Employee {

	public HR() {
		super();
		System.out.println("Hr constructor");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int age =15;
	
	public void getage() {
		System.out.println("500");
	}
	
	public void something() {
		System.out.println("something HR");
		System.out.println(this.age);
		System.out.println(super.age);
		this.getage();
		super.getage();
	}

}
