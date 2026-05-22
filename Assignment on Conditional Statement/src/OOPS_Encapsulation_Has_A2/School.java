package OOPS_Encapsulation_Has_A2;

public class School {

	private String name;
	private String city;
	private String area;
	private Teacher teacher;
	private Student student;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	
	public String  getCity() {
		return city;
	}
	public  void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
