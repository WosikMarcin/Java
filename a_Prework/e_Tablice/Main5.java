/*
W pliku Main5.java
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
2. Stwórz zmienną max i przypisz do niej 0 .
3. W pętli for znajdź liczbę, która jest największa,
   przypisz ją do zmiennej max i wypisz na stronie.
4. Aby to zrobić przeiteruj tablicę i sprawdź 
   czy aktualny element jest większy o aktualnej wartości max i jeśli tak,
   zaktualizuj zmienną max .
5. Sprawdź czy Twój kod będzie działał poprawnie jeśli 
   w tablicy znajdą się tylko liczby ujemne.
6. Spróbuj zmodyfikować kod aby działał on uniwersalnie
*/

package e_Tablice;

public class Main5 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 13, 12, 3, 4, 5, 6, 7, 8, 9, 10 };
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(max + "\n");

		int[] numbers2 = new int[] { -13, -12, -1, -4, -5, -6, -7, -8, -9, -10 };
		int max2 = numbers2[0];
		for (int i = 0; i < numbers2.length; i++) {
			if (numbers2[i] > max2) {
				max2 = numbers2[i];
			}
		}
		System.out.println(max2);
	}
}
