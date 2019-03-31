package com.caseih2;

public class TestAccessModifiers {

	
	Test2 test2 = new Test2();
	
	public void print() {
		System.out.println(test2.name); // default access in one package area
		System.out.println(test2.protectedName);
		System.out.println(test2.publicName);
		System.out.println(test2.getPrivateName());
		System.out.println(Test2.CONSTANT);
		
	}
}
