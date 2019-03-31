package com.caseih2;

public class Test2 {

	public String publicName = "Final name";
	private String privateName;
	protected String protectedName;// 
	String name;
	public final static String CONSTANT = "Connstant";
	private static int id;

	public String getPrivateName() {
		return privateName;
	}

	public void setPrivateName(String privateName) {
		this.privateName = privateName;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Test2.id = id;
	}
}

class TestFinal {
	void some() {
		Test2.setId(2);
	}
}
