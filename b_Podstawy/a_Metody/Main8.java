/*
W pliku Main8.java napisz metodę maxOfThree, która przyjmie trzy parametry liczbowe.
Funkcja ma zwrócić największą liczbę.
*/

package a_Metody;

public class Main8 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		System.out.println(maxOfThree(a, b, c));
	}

	static int maxOfThree(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			return a;
		} else if ((b > a) && (b > c)) {
			return b;
		} else {
			return c;
		}
	}
}
