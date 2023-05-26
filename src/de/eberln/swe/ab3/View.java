package de.eberln.swe.ab3;

import java.util.Scanner;

public class View {

	public int readInt() {

		System.out.println("Zahl eingeben: ");
		
		Scanner scanner = new Scanner(System.in);
		int read = scanner.nextInt();
		
		scanner.close();
		return read;
		
	}
	
	public void print(String s) {
		System.out.println("Die berechnete Zahl ist: " + s);
	}
	
}
