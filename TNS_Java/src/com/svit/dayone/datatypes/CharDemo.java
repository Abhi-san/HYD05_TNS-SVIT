package com.svit.dayone.datatypes;

public class CharDemo {
	public static void main(String[] args) {
		// assigning single character literal
		char ch = 'a';
		System.out.println(ch);

		// assigning number to char
		char ch1 = 65;
		System.out.println("Assigning number to char we used 65 so we get the ouput as "+ch1);

		// assigning unicode to char
		char var1 = '\u00A7';
		System.out.println("Assigning unicode we assigned \\u00A7 so get the ouput as "+var1);

		// Unicode representation
		char var2 = '\u20AC';
		System.out.println("Assigning unicode we assigned \\u20A_C so get the ouput as "+var2);
		
		char var3 = '\u221E';
		System.out.println("Assigning unicode we assigned \\u221_E so get the ouput as "+var3);		

		// ASCI code representation
		int a = 'A';
		System.out.println("ASCI code representation of A is "+a);
	}
}