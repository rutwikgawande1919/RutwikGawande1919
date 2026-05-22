package OOPS_Poly_compileTime;

public class Calculator {

//Sum	
	public void sum(int a,int b) {
		System.out.println("sum :"+(a+b));
	}
	
	public void sum(int a,int b,int c) {
		System.out.println("sum :"+(a+b+c));
	}

//substarction	
	public void substraction(int a,int b) {
		System.out.println("substraction :"+(a-b));
	}
	
	public void substraction(int a,int b,int c) {
		System.out.println("substraction :"+(a-b-c));
	}
	
//division
	public void division(float a,float b) {
		System.out.println("division :"+(a/b));
	}
	public void division(float a,float b, float c) {
		System.out.println("division :"+(a/b/c));
	}
	public void multiply(int a,int b) {
		System.out.println("multiply :"+(a*b));
	}
	public void multiply(int a,int b,int c) {
		System.out.println("multiply :"+(a*b*c));
	}
	
}
