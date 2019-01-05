/*
1. W pliku Main5.java stwórz zmienną resultFor oraz resultWhile
   i przypisz do nich liczbę 0 .
2. Następnie stwórz pętle, która doda do siebie liczby od 1 do 10
   i zapisze do zmiennej resultFor lub resultWhile .
3. Pętla powinna co uruchomienie (zwaną także iteracją pętli) dodawać
   do zmiennej resultFor lub resultWhile kolejną liczbę z podanego zakresu.
4. Napisz zarówno pętle for jak i pętlę while .
5. Wypisz w konsoli w oddzielnych liniach zmienne resultFor oraz resultWhile .
*/

package d_Kontrola_Przeplywu_Programu;

public class Main5 {

	public static void main(String[] args) {
		int resultFor = 0;
		for (int i = 1; i <= 10; i++) {
			resultFor = resultFor + i;
			// resultFor += i ;
		}
		System.out.println("Wynik dodawania to " + resultFor + "\n");

		int resultWhile = 0;
		int licznik = 1;
		while (licznik <= 10) {
			resultWhile = resultWhile + licznik;
			licznik++;
		}
		System.out.println("Wynik dodawanie to " + resultWhile);
	}
}
