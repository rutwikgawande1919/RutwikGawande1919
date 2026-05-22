package OOPS_Encapsulation_Has_A;

public class Employee {
	
	private String id;
	private String firstname;
	private String lastname;
	private String city;
	private Vehicle veh;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Vehicle getVeh() {
		return veh;
	}
	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}

}
