/*
W pliku Main6.java
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
2. Wypisz ją od tyłu używając pętli for , każdy element w nowej linii.
*/

package e_Tablice;

public class Main6 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}
}
