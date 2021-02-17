package com.yourSurname.util;

public class StringUtility {
	
	static String yourSurname = "";
	
	public static String getSumOfAsciiValues(String yourSurname) {
	    int sum = 0;
	    for(int i=0; i<yourSurname.length(); i++)
	    {
	      int asciiValue = yourSurname.charAt(i);
	      sum = sum + asciiValue;
	      //System.out.println(str.charAt(i) + "=" + asciiValue);
	    }
	    System.out.println("ASCII sum" + " = " + sum);
		return yourSurname;
	}
	
	public static String getProductOfAsciiValues(String yourSurname) {
		int product = 1;
	    for(int i=0; i<yourSurname.length(); i++)
	    {
	      int asciiValue = yourSurname.charAt(i);
	      product = product * asciiValue;
	      //System.out.println(str.charAt(i) + "=" + asciiValue);
	    }
	    System.out.println("ASCII product" + " = " + product);
		return yourSurname;
	}
	
	
}
