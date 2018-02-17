package main;

public class ArrayVerschieben {


	public static void nachRechts(int[] array) {
		int ueberfluss = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			if (i == 0) {

				array[i] = ueberfluss;

			} else {

				if (i == array.length - 1) {

					ueberfluss = array[i];
				}

				array[i] = array[i - 1];
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
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
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("["+array[i]+"]");
		}
		
		System.out.println("\n");
	}
}