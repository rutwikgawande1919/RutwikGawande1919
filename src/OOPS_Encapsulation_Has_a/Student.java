package OOPS_Encapsulation_Has_a;

public class Student {
	private String id;
	private String firstname;
	private String lastname;
	private Document doc;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Document getDoc() {
		return doc;
	}
	public void setDoc(Document doc) {
		this.doc=doc;
	}
	
	

}
