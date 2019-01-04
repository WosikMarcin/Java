/*
W pliku Main4.java
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
2. W pętli for sprawdź, które są parzyste i wypisz je na stronie jedna pod drugą.
3. Dodaj dodatkową zmienną sumOdd o wartości 0 .
4. Zmodyfikuj pętlę z pkt.1 w ten sposób aby dodatkowo sumowała liczby nieparzyste.
5. Wyświetl dodatkowo na stronie komunikat wg. wzoru:
   Suma liczb nieparzystych to: 87.
*/

package e_Tablice;

public class Main4 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 4, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sumOdd = 0;
		System.out.println("Liczby parzyste to ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + ", ");
			} else {
				sumOdd += numbers[i];
			}
		}
		System.out.println("\n" + "Suma liczb nieparzystych to " + sumOdd);
	}
}
