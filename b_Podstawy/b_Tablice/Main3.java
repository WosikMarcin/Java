/*
W pliku Main3.java
stwórz 10 elementową tablicę wypełnioną pojedynczą wartością 2.
Tablica powinna wyglądać następująco:
[2. 2. 2. 2. 2. 2 .2 . 2. 2. 2]
Zadanie wykonaj bez użycia pętli for.
*/

package b_Tablice;

import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Arrays.fill(array, 2);
		System.out.println(Arrays.toString(array).replace(',', '.'));
	}
}
