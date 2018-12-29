/* 
W pliku Main3.java stwórz trzy zmienne o nazwach nr1, nr2, result .
1. Jedna niech przechowuje dowolną liczbę całkowitą.
2. Druga dowolną liczbę zmiennoprzecinkową typu double.
3. Trzecia o nazwie result , niech przechowuje liczbę 0 .
4. Zapisz sumę tych liczb w zmiennej result i wypisz na stronie wynik.
Napisz w komentarzu jakiego typu i dlaczego powinna być zmienna result.
*/

package b_Zmienne_i_Typy_Danych;

public class Main3 {

	public static void main(String[] args) {
		int nr1 = 1;
		double nr2 = 1.5;
		double result = 0;
		result = nr1 + nr2;
		System.out.println("Wynik dodawanie to " + result);
	}
}

/*
Zmienna result powinna być typu double ponieważ 
suma liczby całkowitej i zmiennoprzecinkowej jest liczbą zmiennoprzecinkową
*/
