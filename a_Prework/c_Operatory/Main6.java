/*
W pliku Main6.java stwórz trzy zmienne o nazwach nr1, nr2, result .
1. Dwie pierwsze niech przechowują dowolne liczby.
2. Za pomocą odpowiedniego operatora sprawdź czy pierwsza liczba jest
   większa od drugiej i zapisz wynik w zmiennej result .
3. Wypisz tą zmienną w konsoli.
*/

package c_Operatory;

public class Main6 {

	public static void main(String[] args) {
		int nr1 = 3;
		int nr2 = 2;
		boolean result = true;
		result = nr1 > nr2;
		System.out.println(result);
	}
}
