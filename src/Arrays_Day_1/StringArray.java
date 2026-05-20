package Arrays_Day_1;

public class StringArray {

	public static void main(String[] args) {

		
String[] days = {"mon","tue","wed","thurs","fri","sta","sun"};
	     System.out.println(days[1]);
	     
	     System.out.println("==========");
	     
	     for(int i=0;i<days.length;i++) {
	    	 
	    	 if(days[i].startsWith("t")) {
	    		 System.out.println(days[i]);
		    	 
	    	 }
	    	 
	    	 
	    	 
	     }
         
	} 

}
