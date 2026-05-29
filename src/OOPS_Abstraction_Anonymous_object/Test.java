package OOPS_Abstraction_Anonymous_object;

public class Test {

	public static void main(String[] args) {

	Employee e = new Employee() {
		
		@Override
		public void givesalary(int salary) {
			// TODO Auto-generated method stub
			System.out.println(salary);
		}
		
		@Override
		public void getname() {
			// TODO Auto-generated method stub
			System.out.println("Rutwik");
		}
	};
	        e.givesalary(10000);
	        e.getname();
	}

}
