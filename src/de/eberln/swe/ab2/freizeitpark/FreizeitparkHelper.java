package de.eberln.swe.ab2.freizeitpark;

// Aufgabe Freizeitpark
public class FreizeitparkHelper {

	public enum CardType {
		ACHTERBAHN,
		EXTRARUNDE,
		KARUSELL
	}
	
	public void giveMoneyBack(double money) {
		System.out.println("Folgendes Geld wird zurückgegeben: " + money);
	}
	
	public void printTicket(CardType cardType) {
		System.out.println("Fahrkarte für " + cardType + " wird ausgegeben.");
	}
	
}
