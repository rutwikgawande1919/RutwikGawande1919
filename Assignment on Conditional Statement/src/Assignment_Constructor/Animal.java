package Assignment_Constructor;

public class Animal {
    //global variable
	public String stname;
	
	// Default constructor
	public  Animal () {
		System.out.println("Lion");
	}
	//Parameterized constructor
	public Animal(String name) {
		stname=name;
	}
	public void Printname() {
		System.out.println(stname);
	}
}
