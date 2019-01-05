/*
1. W pliku Main3.java stwórz pętle, która 10 razy wypisze w konsoli
   tekst "Lubię Java".
2. Napisz zarówno pętle for jak i pętlę while .
3. W sumie napis będzie widoczny 20 razy.
*/

package d_Kontrola_Przeplywu_Programu;

public class Main3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Lubię Java");
		}

		System.out.println();

		int counter = 1;
		while (counter <= 10) {
			System.out.println("Lubię Java");
			counter++;
		}
	}
}
