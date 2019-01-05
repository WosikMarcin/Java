/*
1. W pliku Main4.java stwórz pętle, która wypisze w konsoli
   liczby od 1 do 100, jedna w jednej linii.
2. Napisz zarówno pętle for jak i pętlę while .
3. W sumie będzie wypisane 200 liczb.
*/

package d_Kontrola_Przeplywu_Programu;

public class Main4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int counter = 1;
		while (counter <= 100) {
			System.out.print(counter + " ");
			counter++;
		}
	}
}
