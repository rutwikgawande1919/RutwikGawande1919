package OOPS_Encapsulation_Has_A2;

public class Test {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setRollno("101");
		st.setFirstname("Pranav");
		st.setLastname("Gawande");
		
		Teacher t = new Teacher();
		t.setId("03");
		t.setFirstname("Sachin");
		t.setLastname("Dhande");
		
		
		School s = new School();
		s.setName("Swami vivekanand");
		s.setCity("Akot");
		s.setArea("Akola Naka");
		s.setTeacher(t);
		s.setStudent(st);
		
		System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getArea());
		System.out.println(s.getTeacher().getId());
		System.out.println(s.getTeacher().getFirstname());
		System.out.println(s.getTeacher().getLastname());
		System.out.println(s.getStudent().getRollno());
		System.out.println(s.getStudent().getFirstname());
		System.out.println(s.getStudent().getLastname());

	}

}
