package Assignment_on_Array;

public class Test1 {

	public static void main(String[] args) {
		
		Student1 s = new Student1();
		s.id =100;
		s.name ="pranav";
		s.marks =97;		
		
		Student1 s1 = new Student1();
		s1.id =101;
		s1.name ="shardul";
		s1.marks =78;
		
		Student1 s2 = new Student1();
		s2.id =102;
		s2.name ="pratik";
		s2.marks =90;
		
		Student1 s3 = new Student1();
		s3.id =103;
		s3.name ="navneet";
		s3.marks =98;
		
		Student1 s4 = new Student1();
		s4.id =104;
		s4.name ="Atharv";
		s4.marks =96;
		
		Student1 s5 = new Student1();
		s5.id =105;
		s5.name ="Rohit";
		s5.marks =86;
		
		Student1[] StudentArray = {s,s1,s2,s3,s4,s5};
		
		for(int i =0;i<StudentArray.length;i++) {
			Student1 st =StudentArray[i];
			System.out.println(st.id);
			System.out.println(st.name);
			System.out.println(st.marks);
			System.out.println("=============");
			
		}
		
		
		
	}
}
