package de.eberln.swe.ab2;

import de.eberln.swe.ab3.Controller;

public class Main {
	
	public static void main(String[] args) {
		
		GleitkommaAutomat automat = new GleitkommaAutomat();
		
		String test = "+523978435,432134E00000021";
		System.out.println(automat.isValid(test));
		
		String test2 = "05378E32";
		System.out.println(automat.isValid(test2));
		
		String test3 = "";
		System.out.println(automat.isValid(test3));
		
		String test4 = "-";
		System.out.println(automat.isValid(test4));
		
	}
	
}
