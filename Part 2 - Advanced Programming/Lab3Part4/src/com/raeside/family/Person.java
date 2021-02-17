
package com.raeside.family;

public class Person {
	
	private String firstName;
	private String familyName;
	
	Person(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;	
	}
	
	//Constructor for firstName.
	public String getFirstName() {
		return firstName;
	}
	
	//Constructor for familyName.
	public String getFamilyName() {		
		return familyName;
	}

}
