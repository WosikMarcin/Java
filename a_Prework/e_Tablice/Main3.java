/*
W pliku Main3.java
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
2. Stwórz zmienną sum i przypisz do niej liczbę 0 .
3. Za pomocą pętli for oblicz sumę liczb z tablicy.
4. Wypisz sumę na stronie wg. wzoru: Suma elementów tablicy to: 381.
*/

package e_Tablice;

public class Main3 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			// sum = sum + numbers[i];
			sum += numbers[i];
		}
		System.out.println("Suma elementów tablicy to " + sum);
	}
}
