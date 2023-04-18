package de.eberln.swe.ab1;

//Aufgabe 1
public class ArraySplit {
	
	public static void main(String[] args) {
			
		System.out.println(canDivideArray(new int[]{21,-42,21,0}));
		System.out.println(canDivideArray(new int[] {Integer.MAX_VALUE,21,-42,21,Integer.MAX_VALUE}));
		
	}
	 
	public static boolean canDivideArray(int[] arr) {
		
		if(arr == null || arr.length <= 1) {
			return false;
		}
		
		boolean currentBool = false;
		
		for(int i = 1; i<arr.length; i++) {
			
			int[] firstArray = new int[i];
			int[] secondArray = new int[arr.length-i];
			
			System.arraycopy(arr, 0, firstArray, 0, i);
			System.arraycopy(arr, i, secondArray, 0, arr.length-i);
			
			if(arrSum(firstArray) == arrSum(secondArray)) {
				currentBool = true;
			}
		}
		
		return currentBool;
		
	}
	
	public static int arrSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
}
