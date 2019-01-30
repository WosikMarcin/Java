/*
W pliku Main2.java
stwórz tablicę z 20 losowymi liczbami z zakresu 0-100, zmienną z tablicą nazwij randNumbers
Użyj do tego pętli for.
Wypisz w konsoli minimalną wartość z tablicy.
*/

package b_Tablice;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		int[] array = new int[20];
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(101);
			System.out.print(array[i] + " ");
		}

		System.out.println();

		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.print("Minimalna wartosc tablicy array to " + min);
	}
}
