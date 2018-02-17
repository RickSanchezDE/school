package main;

public class ArrayErstellen {
	public static int[] intArray(int laenge, boolean zufaelligBefuellen, int min, int max){
		int[] array = new int[laenge];
		
		if(zufaelligBefuellen == true) {
			for(int i = 0; i < array.length; i++) {
				array[i] = (int) (Math.random() * max) + min;
			}
		}
		
		return array;
	}
	
	public static int[] intArray(int laenge) {
		return intArray(laenge, false, 0, 0);
	}
}
