/*
W pliku Main1.java stwórz dwie zmienne o nazwach first, second .
1. Przypisz do nich dwie różne wartości logiczne jakie znasz.
2. Porównaj je za pomocą operatora == , a wynik porównania zapisz do 
   trzeciej zmiennej isFirstEqualSecond .
3. Wyświetl w konsoli zmienną isFirstEqualSecond , aby sprawdzić wynik
4. Zmień wartość zmiennej second na przeciwną i ponownie sprawdź wynik.
*/

package c_Operatory;

public class Main1 {

	public static void main(String[] args) {
		boolean first = true;
		boolean second = true;
		boolean isFirstEqualSecond = (first == second);
		System.out.println(isFirstEqualSecond);
	}
}
