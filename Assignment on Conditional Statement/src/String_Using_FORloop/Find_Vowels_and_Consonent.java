package String_Using_FORloop;

public class Find_Vowels_and_Consonent {

	public static void main(String[] args) {
		
		String str ="Tody is Birthday";
		System.out.println("The string is "+str);
		
		
		int vcount =0 , ccount =0;
		str=str.toLowerCase();
		
		for (int i=0; i<str.length();i++)
		{
			
			if (str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
				vcount++;
			
				else if(str.charAt(i)>='a' && str.charAt(i)<='z') 
				ccount++;
			}	
			System.out.println("Total num of vowels is "+vcount);
			System.out.println("Total num of consonant is "+ccount);
			}
		}
	


