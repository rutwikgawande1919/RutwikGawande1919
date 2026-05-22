package com.java.casting;

public class ExplicitCasting {

	public static void main(String[] args) {
/*explicit casting means converting large data type into
small data type
*but when we try to convert it there will be chances of data losing
*because we will try to convert it forcefully
 */
		float a = 66.77f;
		long b = (long) a;
		System.out.println("value of b is :" +b);
		
	    long q = 987654321l;
	    int w = (int) q;
	    System.out.println("value of w is :" +w);
	    
	    
	    long e = 9876541230l;
	    short r = (short) e;
	    System.out.println("value of r is :" +r);

	}

}
