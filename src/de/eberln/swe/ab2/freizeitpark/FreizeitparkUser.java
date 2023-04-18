package de.eberln.swe.ab2.freizeitpark;

import java.util.Scanner;

import de.eberln.swe.ab2.freizeitpark.FreizeitparkAutomat.Action;

// Aufgabe Freizeitpark
public class FreizeitparkUser {
    private static final FreizeitparkAutomat automat = new FreizeitparkAutomat();

    public static void main(String[] args) {
        System.out.println("Willkommen an Ihrem Ticketautomaten im Freizeitpark XYZ");
        System.out.println("0: Drücke Cancel");
        System.out.println("1: Drücke Kettenkarussell");
        System.out.println("2: Drücke Achterbahn");
        System.out.println("3: Drücke Extrarunde");
        System.out.println("4: Werfe 50 Cent ein");
        System.out.println("5: Werfe 1 Euro ein");
        System.out.println("9: Programm beenden");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Welche Aktion wollen Sie ausführen?");

            int choice = scanner.nextInt();
            switch(choice) {
                case 0: automat.performAction(Action.ABBRUCH); break;
                case 1: automat.performAction(Action.KARUSELL); break;
                case 2: automat.performAction(Action.ACHTERBAHN); break;
                case 3: automat.performAction(Action.EXTRARUNDE); break;
                case 4: automat.performAction(Action.CENT50); break;
                case 5: automat.performAction(Action.EURO1); break;
                case 9: System.exit(0); break;
                default:
            }
        }
    }
}
