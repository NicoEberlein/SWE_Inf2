package de.eberln.swe.ab1;

public class Binominalkoeffizient {

	public int binominal(int k, int n) {
		
		int erg = fakultaet(n) / (fakultaet(k) * fakultaet(n-k));
		
		return erg;
		
	}
	
	private int fakultaet(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return n * fakultaet(n-1);
		}
	}
	
}
