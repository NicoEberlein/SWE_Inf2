package de.eberln.swe.ab1;

//Aufgabe 2
public class BoeseNeun {

	public static boolean isNumberEvil(int num) {
		
		boolean isEvil = false;
		
		if(num % 9 == 0) {
			isEvil = true;
		}
		
		char[] digits = String.valueOf(num).toCharArray();
		
		for(char c : digits) {
			if(c == '9') isEvil = true;
		}
		
		return isEvil;
		
		
	}
	
}
