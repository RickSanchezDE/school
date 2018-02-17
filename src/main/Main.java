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
						nachRechts(array);
					} else {
						if(eingabe == 'l') {
							nachLinks(array);
						} else {
							System.out.println("Falsche Eingabe!");
						}
					}
				}
			}
			
			

	}


	public static void nachRechts(int[] array) {
		int ueberfluss = 0;
		for(int i = array.length-1; i >= 0; i--) {
			if(i == 0) {
				
				array[i] = ueberfluss;
				
			} else {
				
				if(i==array.length-1) {
					
					ueberfluss = array[i];
				}
				
				array[i] = array[i-1];
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print("["+array[i]+"]");
		}
		
		System.out.println("\n");
	}
	
	public static void nachLinks(int[] array) {
		int ueberfluss = 0;
		for(int i = 0; i <= array.length-1; i++) {
			if(i == array.length-1) {
				
				array[i] = ueberfluss;
				
			} else {
				
				if(i==0) {
					
					ueberfluss = array[i];
				}
				
				array[i] = array[i+1];
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print("["+array[i]+"]");
		}
		
		System.out.println("\n");
	}
}
