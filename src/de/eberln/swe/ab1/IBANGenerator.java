package de.eberln.swe.ab1;

import java.math.BigInteger;

//Aufgabe 5
public class IBANGenerator {

	public static String generateIBANChecksum(String blz, String knt) {
		
		BigInteger concat = new BigInteger(blz + knt + "131400");
		System.out.println(concat);
		BigInteger modConcat = concat.mod(BigInteger.valueOf(97));
		
		int checksum = 98 - modConcat.intValueExact();
		
		System.out.println(checksum);
				
		if(checksum < 10) {
			return "0" + checksum;
		}else {
			return String.valueOf(checksum);
		}
	
	}
	
	public static String generateGermanIBAN(String blz, String knt) {
		
		StringBuffer buffer = new StringBuffer("DE");
		
		buffer.append(generateIBANChecksum(blz, knt));
		
		buffer.append(blz);
		
		buffer.append(knt);
		
		return buffer.toString();
		
	}
	
}
