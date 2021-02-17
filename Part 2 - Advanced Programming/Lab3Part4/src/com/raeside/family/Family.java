package com.raeside.family;

//Imports.
import java.util.Vector;
import com.raeside.family.exceptions.FirstNameExistsException;
import com.raeside.family.exceptions.SurnameMismatchException;

public class Family {

	private Vector familyMembers = new Vector();
	private String familyName;
	
	//Constructor for familyName.
	public Family(String familyName) {
		this.familyName = familyName;
	}

	public String[] getFamilyMembers() {
		
		String[] names=new String[familyMembers.size()];
		
		for(int i=0; i < familyMembers.size(); i++) {
			names[i]=((Person)familyMembers.elementAt(i)).getFirstName() + " " + ((Person)familyMembers.elementAt(i)).getFamilyName();
		}
		return names;
	}
	
	//Add family member method, throws both exceptions, decides where to throw exceptions.
	public void addFamilyMember(Person member) throws FirstNameExistsException, SurnameMismatchException {
		
		//Throws FirstNameExistsException here.
		if(newFirstName(member.getFirstName())) {
			familyMembers.addElement(member);
		}
		else {	
			throw new FirstNameExistsException("This family already has a " + member.getFirstName());
		}
		//Throws SurnameMismatchException here.
		if(correctFamilyName(member.getFamilyName())) {
			//
		}
		else {
			throw new SurnameMismatchException("Family name " + member.getFamilyName() + " does not match.");
		}
	}
	
	//Method to check first name eligibility.
	public boolean newFirstName(String firstName) {
		
		for(int i=0; i < familyMembers.size(); i++) {
			if(((Person)familyMembers.elementAt(i)).getFirstName().equals(firstName)) {
				//Name exists in the family.
				return false; 
			}
		}
		//The name was not found.
		return true; 
	}
	
	//Method to check last name eligibility.
	public boolean correctFamilyName(String familyName) {
		
		if(familyName.equals(this.familyName)) {
			//Family name is correct.
			return true; 
		}
		//Person's family name does'nt match
		return false; 			
		}
}
