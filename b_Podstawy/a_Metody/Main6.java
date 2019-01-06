/*
W pliku Main6.java napisz metodę checkMaturity, która:
przyjmie parametr liczbowy age, który oznacza wiek użytkownika,
sprawdzi czy użytkownik jest pełnoletni,
jeśli jest – zwróci wartość true,
jeśli nie – zwróci wartość false.
*/

package a_Metody;

public class Main6 {

	public static void main(String[] args) {
		int age = 19;
		System.out.println(checkMaturity(age));
	}

	static boolean checkMaturity(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
