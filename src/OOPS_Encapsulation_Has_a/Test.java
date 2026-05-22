package OOPS_Encapsulation_Has_a;

public class Test {

	public static void main(String[] args) {
		Document d = new Document();
		d.setAdhar("7466782479848");
		d.setPan("dkvpg2547b");
		d.setLicence("65783hf65786");
		
		
		Student s = new Student();
		s.setId("101");
		s.setFirstname("Rutwik");
		s.setLastname("Gawande");
        s.setDoc(d);
		
		
		
		System.out.println(s.getId());
		System.out.println(s.getFirstname());
		System.out.println(s.getLastname());
		System.out.println(s.getDoc().getAdharno());
		System.out.println(s.getDoc().getPan());
		System.out.println(s.getDoc().getLicence());
	}

}
