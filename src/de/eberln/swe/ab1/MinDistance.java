package de.eberln.swe.ab1;

//Aufgabe 7 & 8
public class MinDistance {

	public static <T extends Number> int getMinDistance(T[] number) {
		
		double minDistance = Double.MAX_VALUE;
		int currentMinIndex = number.length;
		
		for(int i = 0; i<number.length-1; i++) {
			
			double currentDistance = Math.abs(number[i].doubleValue() - number[i+1].doubleValue());
			
			if(currentDistance < minDistance) {
				minDistance = currentDistance;
				currentMinIndex = i;
			}
			
		}
		
		return currentMinIndex;
		
	}
	
}
