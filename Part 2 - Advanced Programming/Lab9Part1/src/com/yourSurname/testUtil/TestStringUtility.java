package com.yourSurname.testUtil;

import com.yourSurname.util.StringUtility;

public class TestStringUtility {
	
	public static String yourSurname = "Mraz";

	public static void main(String[] args) {
		StringUtility.getSumOfAsciiValues(yourSurname);
		StringUtility.getProductOfAsciiValues(yourSurname);

	}

}
