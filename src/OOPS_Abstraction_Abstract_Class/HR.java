package OOPS_Abstraction_Abstract_Class;

public class HR extends Employee {

	@Override
	public void getName() {
		System.out.println("HR");
	}

	@Override
	public void givesalary(int salary) {
       salary = salary/10;
       System.out.println("HR salary :"+salary);
	}


}
