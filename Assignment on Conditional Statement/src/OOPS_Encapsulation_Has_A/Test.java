package OOPS_Encapsulation_Has_A;

public class Test {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.setVcompany("Maruti Suzuki");
		v.setVname("Dzire");
		v.setVmilage("24.8");
		
		
		Employee e = new Employee();
		e.setId("110");
		e.setFirstname("Shrikant");
		e.setLastname("patil");
		e.setCity("Bombay");
		e.setVeh(v);
		
		
		System.out.println("Employee id is: "+e.getId());
		System.out.println("Employee firstname is: "+e.getFirstname());
		System.out.println("Employee lastname is: "+e.getLastname());
		System.out.println("Employee location is: "+e.getCity());
		System.out.println("Vehicle company name is: "+e.getVeh().getVcompany());
		System.out.println("Vehicle model name is: "+e.getVeh().getVname());
		System.out.println("Vehicle milage is: "+e.getVeh().getVmilage());
	}

}
