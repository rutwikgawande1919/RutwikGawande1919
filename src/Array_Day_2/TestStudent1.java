package Array_Day_2;

public class TestStudent1 {

	public static void main(String[] args) {

		Student1 s= new Student1();
		s.id = 101;
		s.name = "Ram";
		
		Student1 s1 = new Student1();
		
		s1.id =102;
		s1.name ="Sham";
		
		Student1[] studentArray = {s,s1};
		
		for(int i =0;i<studentArray.length;i++) {
		Student1  st = studentArray[i];
		System.out.println(st.id);
		System.out.println(st.name);
		}
		
	}

}
