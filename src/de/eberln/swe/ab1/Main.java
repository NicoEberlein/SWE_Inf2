package de.eberln.swe.ab1;

//Es fehlen noch: Aufgabe 9 - 12

public class Main {

	public static void main(String[] args) {
//		
//		System.out.println(BoeseNeun.isNumberEvil(412110));
//		
//		System.out.println(IBANGenerator.generateIBANChecksum("78160069", "0001003550"));
//		System.out.println(IBANGenerator.generateIBANChecksum("78060896", "0007631839"));
//		
//		System.out.println(IBANGenerator.generateGermanIBAN("70090100", "1234567890"));
//		
//		System.out.println(Arrays.toString(TwistArray.twistArray(new Integer[] {0,1,2,3,4,5,6})));
//		System.out.println(Arrays.toString(TwistArray.twistArray(new Integer[] {0,1,4,-3,4,9})));
//	
//		System.out.println(MinDistance.getMinDistance(new Integer[] {33, 8, 1, 6, 43, 54}));
		
		Binominalkoeffizient b = new Binominalkoeffizient();
		TennisPropability t = new TennisPropability();
		
		for(int i = 1; i<=100; i++) {
			System.out.println(i + "  " + t.getProbability2(i));
		}
		
	}
	
}
