package OOPS_Abstraction_Abstract_Class;

public class Developer extends Employee {

	@Override
	public void getName() {
       System.out.println("Developer");
		
	}

	@Override
	public void givesalary(int salary) {
        salary = salary*10;
        System.out.println("Dev salary :"+salary);
	}



}
