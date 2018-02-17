package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			int[] array = new int[5];
			Scanner sc = new Scanner(System.in);
			array[0] = 1;
			array[1] = 2;
			array[2] = 3;
			array[3] = 4;
			array[4] = 5;
			boolean wirdAusgefuehrt = true;
			char eingabe;
			
			while(wirdAusgefuehrt == true) {
				System.out.println("Verschieben, oder beenden?");
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
							System.out.println("Falsche Eingabe!");
						}
					}
				}
			}
			
	}


	
	
	
}
