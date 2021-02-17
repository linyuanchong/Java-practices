package com.raeside.family;

//Imports.
import com.raeside.family.exceptions.FirstNameExistsException;
import com.raeside.family.exceptions.SurnameMismatchException;

public class MakeFamilyRobinson {

	public static void main(String[] args) {
		
		//Normal members.
		Person member1 = new Person("Terry","Robinson");
		Person member2 = new Person("Paul","Robinson");
		Person member3 = new Person("Peter","Robinson");
		Person member4 = new Person("Missy","Robinson");
		Person member5 = new Person("John","Robinson");
		//Member with repeating a first name.
		Person member6 = new Person("Paul","George");
		//Member with repeating a different family name.
		Person member7 = new Person("Pater","Parker");
		
		//Create family (specify family name).
		Family robinsons = new Family("Robinson");
		
		//Tries to add all members given above.
		try {
			robinsons.addFamilyMember(member1);
			robinsons.addFamilyMember(member2);
			robinsons.addFamilyMember(member3);
			robinsons.addFamilyMember(member4);
			robinsons.addFamilyMember(member5);
			robinsons.addFamilyMember(member6);
			robinsons.addFamilyMember(member7);
		}
		
		//Catches first name exception.
		catch(FirstNameExistsException ex) {
			ex.printStackTrace();
			System.out.println("First name repeated.");
		} 
		
		//Catches last name exception.
		catch (SurnameMismatchException e) {
			e.printStackTrace();
			System.out.println("Family name mismatch.");
		}
		
		//Print.
		String[] familyList = robinsons.getFamilyMembers();		
		for(int i=0;i<familyList.length;i++) {
			System.out.println(familyList[i]);
		}

	}
}

