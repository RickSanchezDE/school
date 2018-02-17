package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] array = null;
			int laenge = 0, max = 0, min = 0;
			boolean zufaelligGefuellt = false;
			boolean wirdAusgefuehrt = true;
			char eingabe;
			
			System.out.println("Wie lang soll das Array sein?");
			laenge = sc.nextInt();
			System.out.println("Zufällig befüllt? (J/N)");
			zufaelligGefuellt = (sc.next().charAt(0)=='J') ? true: false;
			
			if (zufaelligGefuellt) {
				System.out.println("Minimum der der zufälligen Zahlen eingeben. (nur positive Zahlen erlaubt)");
				min = sc.nextInt();
				System.out.println("Maximum der der zufälligen Zahlen eingeben. (nur positive Zahlen erlaubt)");
				max = sc.nextInt();
				array = ArrayErstellen.intArray(laenge, true, min, max);
			} else {
				array = ArrayErstellen.intArray(laenge);
				
				for(int i = 0; i < array.length; i++) {
					System.out.println("Zahl für Arrayfeld Nr. " + (i+1) + " eingeben:");
					array[i] = sc.nextInt();
				}
				
			}

			while(wirdAusgefuehrt == true) {
				System.out.println("Verschieben, anzeigen oder beenden? (r = rechts; l = links; a = abbrechen; s = anzeigen)");
				eingabe = sc.next().charAt(0);
				if (eingabe == 'a') {
					System.out.println("Programm wurde beendet!");
					wirdAusgefuehrt = false;
				} else {
					if(eingabe == 'r') {
						
						ArrayVerschieben.nachRechts(array);
						
					} else {
						
						if(eingabe == 'l') {
							
							ArrayVerschieben.nachLinks(array);
							
						} else {
							
							if(eingabe == 's') {
								
								for(int i = 0; i < array.length; i++) {
									
									System.out.print("["+array[i]+"]");
									
								}
								
								System.out.println("\n");
								
						} else {
							
							System.out.println("Falsche Eingabe!");
							
						}
						}
					}
				}
			}
			
	}


	
	
	
}
