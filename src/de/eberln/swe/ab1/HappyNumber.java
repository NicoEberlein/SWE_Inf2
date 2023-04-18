package de.eberln.swe.ab1;

import java.util.ArrayList;

//Aufgabe 3
public class HappyNumber {
	
	public static boolean isHappy(int number)  {
		
		ArrayList<Integer> i = new ArrayList<>();
		int currentNumber = number;
		
		while(currentNumber > 1 && !i.contains(currentNumber)) {
			
			i.add(currentNumber);
			currentNumber = (int) Math.pow(number % 10, 2) + (int) Math.pow(number / 10, 2); 
			System.out.println(currentNumber);
			
		}
		
		if(currentNumber == 1) return true;
		return false;
		
	}
	
}
