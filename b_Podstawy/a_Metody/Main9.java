/*
W pliku Main9.java Napisz metodę factorial, która przyjmie jako parametr liczbę naturalną n.
Funkcja ma zwrócić wartość n!, czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1..n .
*/

package a_Metody;

public class Main9 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));
	}

	static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}
