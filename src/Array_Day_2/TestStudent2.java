package Array_Day_2;

public class TestStudent2 {

	public static void main(String[] args) {

		Student2 s = new Student2();
		s.id =101;
		s.name ="Pranav";
		s.mathsobtained =89;
		
		Student2 s1 = new Student2();
		s1.id = 102;
		s1.name ="vaishnavi";
		s1.mathsobtained =98;
		
		Student2[] StudentArray = {s ,s1};
		
		for(int i =0;i<StudentArray.length;i++) {
	Student2 st	=StudentArray[i];
	System.out.println(st.id);
	System.out.println(st.name);
	System.out.println(st.mathsobtained);
			
		}
	}

}
