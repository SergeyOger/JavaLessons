package com.caseih;
import com.caseih2.*;

/*
 * public - access in all package and class
 * private - access in parent class 
 * default - access in package
 * protected - access in package and class object
 */

public class Test{
	public int id;

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.publicName = "Test";
		
		
	}

}
