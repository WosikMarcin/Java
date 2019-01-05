/*
1. W pliku Main6.java napisz kod, który na podstawie wartości zmiennej
   np. int n = 5; wypisuje wszystkie liczby od
   zera do n. Przy każdej liczbie wypisz, czy liczba jest parzysta czy nie.
   
Wzór:
0 – parzysta
1 – nieparzysta
2 – parzysta
3 – nieparzysta
...

Zmień wartość zmiennej n i uruchom ponownie. Napisz zarówno pętle for
jak i pętlę while .
*/

package d_Kontrola_Przeplywu_Programu;

public class Main6 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - liczba parzysta");
			} else {
				System.out.println(i + " - liczba nieparzysta");
			}
		}

		System.out.println();

		int counter = 0;
		while (counter <= n) {
			if (counter % 2 == 0) {
				System.out.println(counter + " - liczba parzysta");
			} else {
				System.out.println(counter + " - liczba nieparzysta");
			}
			counter++;
		}
	}
}
