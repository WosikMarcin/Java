/*
W pliku Main5.java
stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
Posortuj rosnąco tablicę wykorzystując metody klasy Arrays.
Wyświetl w konsoli posortowaną tablicę - również wykorzystaj metodę klasy Arrays.
*/

package b_Tablice;

import java.util.Arrays;

public class Main5 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 8, 2, 1, 10, 3, 7, 4, 9, 5, 6 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers)); 
	}
}
