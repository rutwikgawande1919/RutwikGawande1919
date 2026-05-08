package Strings;

public class TestString {

	public static void main(String[] args) {

// Object created Using literals		
		String s = "Irise";
		
//Object created Using new Keyword		
		String s1 = new String("Irise");
		
//Object created using literals 		
		String s2 = "Irise";
		
// Object created using new keyword		
		String s3 = new String("Irise"); 
		
// The memory location of s and s2 are same thats why the identityHash code are same
//and The memory location of s1 and s3 are different thats why the identityHash code are different				
		System.out.println("s :"+ System.identityHashCode(s));
		System.out.println("s1 :"+ System.identityHashCode(s1));
		System.out.println("s2 :"+ System.identityHashCode(s2));
		System.out.println("s3 :"+ System.identityHashCode(s3) );
		
		
System.out.println("====================================");		

// equals() is used when we wand to compare the (String)/value of variable

		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		
System.out.println("====================================");		

//double equals sign (==) is used when we want to compare the variable/OBJECT/IDENTITY HASHCODE 
          System.out.println(s==s1);
          System.out.println(s==s2);
          System.out.println(s1==s3);
	}

}
