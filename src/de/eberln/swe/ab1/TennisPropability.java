package de.eberln.swe.ab1;

public class TennisPropability {

	public double getPropability(int n) {
		
		Binominalkoeffizient b = new Binominalkoeffizient();
		
		double forErg = 0;
		
		for(int i = 1;i<=n-1;i++) {
			int zw = n-1+i;
			forErg += b.binominal(i, zw) * Math.pow(0.8, n) * Math.pow(0.2, i);
		}
		
		return Math.pow(0.8, n) + forErg;
		
	}
	
	public double getProbability2(int n) {
		
		Binominalkoeffizient b = new Binominalkoeffizient();
		
		double forErg = 0;
		
		for(int i = 0;i<=n-1;i++) {
			int zw = n-1+i;
			forErg += b.binominal(i, zw) * Math.pow(0.2, i);
		}
		
		return Math.pow(0.8, n) * forErg;
		
	}
	
}
