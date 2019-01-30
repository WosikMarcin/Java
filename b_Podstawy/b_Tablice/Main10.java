/*
W pliku Main11.java znajduje się tablica o nazwie task4Array.
Wypisz na konsoli ślad macierzy (sumę elementów na głównej przekątnej).
*/

package b_Tablice;

public class Main10 {

	public static void main(String[] args) {
		int[][] task4Array = { 
				{ 2, 3, 4, 6 },
				{ 12, 32, 12, 11 },
				{ 3, 2, 1, 4 },
				{ 5, 1, 6, 7 } };

		int sum = 0;
		for (int i = 0; i < task4Array.length; i++) {
			for (int j = i; j < task4Array.length; j = j + 1) {
				if (i == j) {
					sum += task4Array[i][j];
				}
			}
		}
		System.out.println("Slad macierzy wynosi: " + sum);
	}
}
