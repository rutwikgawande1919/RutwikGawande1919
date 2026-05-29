package OOPS_Abstraction_Abstract_Class;

public class Test {

	public static void main(String[] args) {
		int salary =10000;
		
		Employee e ;
		
		e = new Developer();
	    e.getName();
	    e.givesalary(salary);
	    
	     e = new HR();
	    e.getName();
		e.givesalary(salary);
	}
}
