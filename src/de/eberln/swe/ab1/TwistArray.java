package de.eberln.swe.ab1;

//Aufgabe 6
public class TwistArray {

	public static <T> T[] twistArray(T[] array) {
		
		for(int i = array.length-1;i>=array.length/2;i--) {
	
			int twistedIndex = Math.abs(i - array.length + 1);
			
			T tmp = array[twistedIndex];
			
			array[twistedIndex] = array[i];
			array[i] = tmp;
		
		}
		
		return array;
		
	}
	
}
