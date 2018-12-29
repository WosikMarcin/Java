/*
W pliku Main7.java stwórz trzy zmienne o nazwach nr1, nr2, result .
1. Do zmiennych nr1 i nr2 przypisz liczby odpowiednio 7 i 4 .
2. Do zmiennej result przypisz ich sumę i wypisz ją w konsoli.
3. Zmiennej nr1 zmień wartość na 10 ale nie usuwając poprzedniego
   kodu, pisz w linijkach niżej.
4. Ponownie oblicz sumę nr1 i nr2 i przypisz ją do zmiennej result ,
   wypisz wynik w konsoli.
5. Wynik nie jest taki sam jak w pkt 2, napisz w komentarzu,
   dlaczego tak się stało.
*/

package c_Operatory;

public class Main7 {

	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 4;
		int result = nr1 + nr2;
		System.out.println(result);
		nr1 = 10;
		result = nr1 + nr2;
		System.out.println(result);
	}
}

/*
Wynik dodawania zmienił się, powodem tego było nadpisanie
ze zmianą wartości zmiennej nr1
*/
