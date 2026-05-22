package OOPS_Encapsulation_Has_A1;

public class Test {

	public static void main(String[] args) {
	
		Parents p = new Parents();
		p.setFathername("Ranjeet patil");
		p.setMothername("Sunita Ranjeet patil");
		
		
		Student s =new Student();
		s.setId("001");
		s.setFirstname("Aniket");
		s.setLastname("patil");
		s.setParent(p);
		
		
		Teacher t = new Teacher();
		t.setFirstname("Suyash ");
		t.setLastname("Patil");
		t.setSt(s);
		
		System.out.println(t.getFirstname());
		System.out.println(t.getLastname());
		System.out.println(t.getSt().getId());
		System.out.println(t.getSt().getFirstname());
		System.out.println(t.getSt().getLastname());
		System.out.println(t.getSt().getParent().getFathername());
		System.out.println(t.getSt().getParent().getMothername());

	}

}
