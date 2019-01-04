/*
W pliku Main2.java stwórz tablicę z listą swoich ulubionych owoców,
zmienną z tablicą nazwij fruits .
Następnie:
1. Wypisz pierwszy owoc na stronie wg. wzoru: Pierwszy owoc to: truskawka.
2. Wypisz ostatni owoc na stronie wg. wzoru: Ostatni owoc to:
   malina (skorzystaj z length ).
3. W pętli wypisz wszystkie owoce każdy w nowej linii (skorzystaj z length ).
*/

package e_Tablice;

public class Main2 {

	public static void main(String[] args) {
		String[] fruits = new String[] { "banan", "pamarancza", "jablko" };
		System.out.println("Pierwszy owoc to " + fruits[0]);
		System.out.println("Ostatni owoc to " + fruits[fruits.length - 1] + "\n");

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}
